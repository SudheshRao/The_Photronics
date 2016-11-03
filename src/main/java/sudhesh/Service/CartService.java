package sudhesh.Service;

import java.util.List;

import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

public interface CartService {

	public Cart getCartById(int cartId);
	
	public void update(Cart cart);
	 
	
	public List<Cartitem> getCartItemByCartId(int cartid);

	public Cart getCartByCartId(int cartid);

}
