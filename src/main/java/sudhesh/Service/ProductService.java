package sudhesh.Service;

import java.util.List;

import sudhesh.model.Product;

/*
 * Product Service Interface
 * created by sudhesh rao p 
 */

public interface ProductService {
	
	 List<Product> getProductList(String inst);
	 
	 Product getProductById(int id);
	 
	 void addProduct(Product a);
	 
	 void editProduct(Product product);
	 
	 void deleteProduct(Product product);
	 
}
