package sudhesh.DAO;

import java.io.IOException;

import sudhesh.model.Cart;

public interface CartDAO {
	
	public Cart getCartById (int cartId);
	
	public void update(Cart cart);
	
	 public Cart validate(int cartId) throws IOException;
	 
	 

}
