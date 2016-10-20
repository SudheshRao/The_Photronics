package sudhesh.Service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.ProductDAO;
import sudhesh.Service.ProductService;
import sudhesh.model.Product;

/*
 * Product Service Implementation
 * created by sudhesh rao p 
 */

@Service
public class ProductServiceimpl implements ProductService {

		@Autowired
		public ProductDAO productdao;

		public void setProductdao(ProductDAO productdao) {
			this.productdao = productdao;
		}
		
		// add product service implementation
		@Transactional
		public void addProduct(Product a) {
			this.productdao.addProduct(a);
		
		}
	
		//view product service implementation
		@Transactional
		public List<Product> getProductList(String inst) {
			return productdao.getProductList(inst);
		}
		
		//get product service implementation
		@Transactional
		public Product getProductById(int id) {
			return (Product) this.productdao.getProductById(id);
		}
		
		//edit product service implementation
		@Transactional
		public void editProduct(Product product) {
			productdao.editProduct(product);
		}
		
		//delete product implementation
		@Transactional 
		public void deleteProduct(Product product) {
			productdao.deleteProduct(product);
		}
}
