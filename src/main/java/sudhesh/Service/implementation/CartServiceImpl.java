package sudhesh.Service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sudhesh.DAO.CartDAO;
import sudhesh.Service.CartService;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

@Service
public class CartServiceImpl implements CartService {
	
    @Autowired
    private CartDAO cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {
        cartDao.update(cart);
    }
    public List<Cartitem> getCartItemByCartId (int id) {
        return cartDao.getCartItemByCartId(id);
    }
	public Cart getCartByCartId(int cartid){
		return cartDao.getCartByCartId(cartid);
	}

}
