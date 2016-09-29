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

import sudhesh.DAO.ProductServiceimpl;
import sudhesh.model.Product;


@Controller
public class ProductController {
	
	@Autowired
	ProductServiceimpl productService;

	@Qualifier(value="productService")
	public void setProductservice(ProductServiceimpl productservice) {
		this.productService = productservice;
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public String addproduct(Model model){
		model.addAttribute("productForm", new Product());
		return "product";
	}
	 @RequestMapping(value="/addproduct" , method=RequestMethod.POST)
	    public String addproductsuccess(@Valid @ModelAttribute ("productForm") Product addproduct, BindingResult result, HttpServletRequest request){
			
			String filename = null;
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
					System.out.println("Image uploaded");
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
			
			if(result.hasErrors())
				return "product";
			
	    		   return "index";	
	    	}
	 
	 @RequestMapping(value="/viewproduct")
		public String viewproduct(Model model){
		List<Product> product = productService.getProductList();
		model.addAttribute("viewpro", product);
		return "viewproduct";
		}
	 
	 @RequestMapping(value="/editproduct/{id}")
	 public String editProduct(@PathVariable("id") int id, Model model ){
		 Product prod= productService.getProductById(id);
		 model.addAttribute("prod", prod);
		 return "editproduct";
	 }
	 /*@RequestMapping(value="/editproduct", method=RequestMethod.POST)
	 public String editProductByPost(@Valid @ModelAttribute("editproduct") AddProduct product ,BindingResult result, HttpServletRequest request) {
		return "editproduct";
		
	 }*/
}
