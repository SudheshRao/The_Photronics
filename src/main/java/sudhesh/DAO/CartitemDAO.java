package sudhesh.DAO;

import java.util.List;

import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

public interface CartitemDAO {

	public void addCartItem(Cartitem cartItem);
	
	public void removeCartItem (Cartitem cartItem);
	
	public void removeAllCartItems(Cart cart);
	
	public Cartitem getCartItemByCiId (int ciid);

	public List<Cartitem> getCartItemByProductId(int id);

	public void removeCartItemList(List<Cartitem> cartItem);

	public List<Cartitem> getCartItemByCartId(int cartid);

	
}
