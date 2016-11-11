package sudhesh.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Files;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import sudhesh.Service.CartitemService;
import sudhesh.Service.ProductService;
import sudhesh.model.Cartitem;
import sudhesh.model.Product;

/*
 * Product controller
 * created by sudhesh rao p 
 */

@Controller
public class ProductController {
	private Path path;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartitemService cartItemService;
	 
	@Qualifier(value="productService")
	public void setProductservice(ProductService productservice) {
		this.productService = productservice;
	}
	
	//add product form code 
	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public String addproduct(Model model){
		
		model.addAttribute("productForm", new Product());
		return "product";
	}
	
	//add product post code
	@RequestMapping(value="/addproduct" , method=RequestMethod.POST)
	public String addproductsuccess(@Valid @ModelAttribute ("productForm") Product addproduct, BindingResult result, HttpServletRequest request){
			
		if(result.hasErrors())
			return "product";
			
		else {
			
			byte[] bytes;
			if (!addproduct.getproductpicture().isEmpty()) {

				try {
					
					bytes = addproduct.getproductpicture().getBytes();
					this.productService.addProduct(addproduct);
					System.out.println("Data Inserted");
					String path = request.getSession().getServletContext().getRealPath("/WEB-INF/resources/images/" + addproduct.getId() + ".jpg");
					System.out.println("Path = " + path);
					System.out.println("File name = " + addproduct.getproductpicture().getOriginalFilename());
					File f = new File(path);
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
					bs.write(bytes);
					bs.close();
					System.out.println("Image uploaded");} 
				
				catch (Exception ex) {
					System.out.println(ex.getMessage());}
				}
			
			  return "redirect:/allProducts";	
	    	}}
	 
	//view product code
	 @RequestMapping(value="/viewproduct")
	 public String viewproduct(Model model,HttpServletRequest request){
		String inst=request.getParameter("param");
		List<Product> product = productService.getProductList(inst);
		model.addAttribute("viewpro", product);
		return "userviewproduct";
		}
	 
	 //view all products
	 @RequestMapping(value="/allProducts")
	 public String allproduct(Model model,HttpServletRequest request){
		List<Product> product = productService.getProduct();
		model.addAttribute("viewpro", product);
		return "userviewproduct";
		}
	 
	 
	 //edit product form code
	 @RequestMapping(value="/editproduct/{id}")
	 public String editProduct(@PathVariable("id") int id, Model model ){
		 
		 Product prod= productService.getProductById(id);
		 model.addAttribute("prod", prod);
		 return "editproduct";
	 }
	 
	 //edit product post code
	 @RequestMapping(value="/editproduct/editpro/{id}", method=RequestMethod.POST)
	 public String editProductByPost(@Valid @ModelAttribute("prod") Product product ,BindingResult result, HttpServletRequest request) {
		 
		 if(result.hasErrors())
			 return "editproduct";
		 
		 else {
			 
		 MultipartFile productpicture= product.getproductpicture();
		 String rootDirectory =request.getSession().getServletContext().getRealPath("/");
		 path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + product.getId()+".jpg");
		 
		 if(productpicture !=null && !productpicture.isEmpty()){
			 
			 try {
				 productpicture.transferTo(new File(path.toString()));} 
			 catch(Exception e) {
				 e.printStackTrace();
				 throw new RuntimeException("Product picture updating failed");}
		 	}
		 
		productService.editProduct(product);
		return "redirect:/allProducts";
	 }}

	 //delete a product
	 @RequestMapping("/deleteproduct/{id}")
	 public String deleteProduct(@PathVariable(value = "id") int id, Model model, HttpServletRequest request) {
		 System.out.println("Path = " + id);

		 List<Cartitem> cartItem = cartItemService.getCartItemByProductId(id);
		 cartItemService.removeCartItemList(cartItem);
		 String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		 path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + id + ".jpg");
		 System.out.println("Path = " + path);
		 
		 if (Files.exists(path)) {
	            
			 try {
	                Files.delete(path);} 
			 catch (Exception e) {
	                e.printStackTrace();}
	        }

	        Product product = productService.getProductById(id);
	        productService.deleteProduct(product);
	        return "redirect:/";
	    }
	 
	 // product info code
	 @RequestMapping("/infoproduct/{id}")
	    public String info(@PathVariable int id) {
		 return "redirect:/infoproduct?id="+id;
	    }
	 @RequestMapping("infoproduct")
	 public String infopro(Model model,HttpServletRequest request) {
		 int id=Integer.parseInt(request.getParameter("id"));
		 Product prod= productService.getProductById(id);
		 model.addAttribute("info", prod);
	        return "infoproduct";
	    }

}
