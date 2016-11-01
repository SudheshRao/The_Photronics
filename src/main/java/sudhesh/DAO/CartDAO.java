package sudhesh.DAO;

import java.io.IOException;
import java.util.List;

import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

public interface CartDAO {
	
	public Cart getCartById (int cartId);
	
	public void update(Cart cart);
	
	 public Cart validate(int cartId) throws IOException;
	 
		public List<Cartitem> getCartItemByCartId(int id);


}
