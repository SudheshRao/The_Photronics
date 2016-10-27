package sudhesh.Service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sudhesh.DAO.CartDAO;
import sudhesh.Service.CartService;
import sudhesh.model.Cart;

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

}
