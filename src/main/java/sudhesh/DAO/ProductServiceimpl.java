package sudhesh.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.model.Product;

@Service
public class ProductServiceimpl {

		@Autowired
		public ProductDAOimpl productdao;

		public void setProductdao(ProductDAOimpl productdao) {
			this.productdao = productdao;
		}
		
		// add product service implementation
		@Transactional
		public void addProduct(Product a) {
			this.productdao.addProduct(a);
		
		}
	
		//view product service implementation
		@Transactional
		public List<Product> getProductList() {
			return productdao.getProductList();
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
