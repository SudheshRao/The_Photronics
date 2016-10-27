package sudhesh.DAO.implementation;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.CartDAO;
import sudhesh.Service.OrderService;
import sudhesh.model.Cart;

@Repository
@Transactional
public class CartDAOImpl implements CartDAO {

	 @Autowired
	    private SessionFactory sessionFactory;

	    @Autowired
	    private OrderService customerOrderService;

	    public Cart getCartById (int cartid) {
	        Session session = sessionFactory.getCurrentSession();
	        return (Cart) session.get(Cart.class, cartid);
	    }

	    public void update(Cart cart) {
	        int cartId = cart.getCartid();
	        double grandTotal = customerOrderService.getCustomerOrderGrandTotal(cartId);
	        cart.setGrandtotal(grandTotal);

	        Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(cart);
	    }

	    public Cart validate(int cartId) throws IOException {
	        Cart cart=getCartById(cartId);
	        if(cart==null||cart.getCartItems().size()==0) {
	            throw new IOException(cartId+"");
	        }
	        update(cart);
	        return cart;
	    }
}
