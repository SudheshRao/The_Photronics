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
		
		@Transactional
		public void addProduct(Product a) {
			this.productdao.addProduct(a);
		
		}
	
		@Transactional
		public List<Product> getProductList() {
			return productdao.getProductList();
		}
		
		@Transactional
		public Product getProductById(int id) {
			return (Product) this.productdao.getProductById(id);
		}
}
