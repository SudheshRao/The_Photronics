package sudhesh.DAO.implementation;

import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.CartDAO;
import sudhesh.Service.OrderService;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;

@Repository
@Transactional
public class CartDAOImpl implements CartDAO {

	 @Autowired
	    public SessionFactory sessionFactory;

	    @Autowired
	    public OrderService customerOrderService;

	    public Cart getCartById (int cartid) {
	        Session session = sessionFactory.getCurrentSession();
	        return (Cart) session.get(Cart.class, cartid);
	    }


	    
	    public List<Cartitem> getCartItemByCartId (int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from Cartitem where cartid = ?");
	        query.setInteger(0, id);
	        List<Cartitem> cartitem= query.list();
	        session.flush();
	        return cartitem;
	    }
	    public void update(Cart cart) {
	        int cartId = cart.getCartid();
	        double grandTotal = customerOrderService.getCustomerOrderGrandTotal(cartId);
	        cart.setGrandtotal(grandTotal);
	        Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(cart);
	        session.flush();
	    }

	    public Cart validate(int cartId) throws IOException {
	    	System.out.println("im here");
	        Cart cart=getCartById(cartId);
	        if(cart==null||cart.getCartItems().size()==0) {
	            throw new IOException(cartId+"");
	        }
	        update(cart);
	        return cart;
	    }


}
