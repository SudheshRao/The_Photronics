package sudhesh.Service;

import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

public interface CartitemService {
		
	public void addCartItem(Cartitem cartItem);
	
	public void removeCartItem(Cartitem cartItem);
	
	public void removeAllCartItems(Cart cart);
	
	public Cartitem getCartItemByCiId (int ciid);

}
