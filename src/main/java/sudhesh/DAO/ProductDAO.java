package sudhesh.DAO;

import java.util.List;

import sudhesh.model.Product;

/*
 * Product DAO Interface
 * created by sudhesh rao p 
 */

public interface ProductDAO {

	void addProduct(Product a);
	
	List<Product> getProductList(String inst);
	
	Product getProductById(int id);
	
	void editProduct(Product product);
	
	void deleteProduct(Product product);
}
