package sudhesh.Service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sudhesh.DAO.CartitemDAO;
import sudhesh.Service.CartitemService;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

@Service
public class CartitemServiceImpl implements CartitemService {

	@Autowired
    private CartitemDAO cartItemDao;

    public void addCartItem(Cartitem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(Cartitem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public Cartitem getCartItemByCiId (int ciid) {
        return cartItemDao.getCartItemByCiId(ciid);
    }
}
