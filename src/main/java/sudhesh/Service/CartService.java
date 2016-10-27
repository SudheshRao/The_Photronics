package sudhesh.Service;

import sudhesh.model.Cart;

public interface CartService {

	public Cart getCartById(int cartId);
	
	public void update(Cart cart);
}
