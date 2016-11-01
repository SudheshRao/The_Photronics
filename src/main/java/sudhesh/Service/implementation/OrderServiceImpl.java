package sudhesh.Service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sudhesh.DAO.OrderDAO;
import sudhesh.Service.CartService;
import sudhesh.Service.OrderService;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;
import sudhesh.model.Order;

@Service
public class OrderServiceImpl implements OrderService {
	
	 @Autowired
	    private OrderDAO OrderDao;

	    @Autowired
	    private CartService cartService;

	    public void addCustomerOrder(Order order) {
	        OrderDao.addCustomerOrder(order);
	    }

	    public double getCustomerOrderGrandTotal(int cartId) {
	        double grandTotal=0;
	        Cart cart = cartService.getCartById(cartId);
	        List<Cartitem> cartItems = cart.getCartItems();

	        for (Cartitem item : cartItems) {
	            grandTotal+=item.getTotal();
	        }

	        return grandTotal;
	    }
		public List<Order> getOrderByCartId(int cartid){
			return OrderDao.getOrderByCartId(cartid);
		}
		public void deleteOrder(Order order){
			OrderDao.deleteOrder(order);
		}

}
