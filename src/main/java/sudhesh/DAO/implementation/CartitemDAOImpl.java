package sudhesh.DAO.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import sudhesh.DAO.CartitemDAO;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;


@Repository
@Transactional
public class CartitemDAOImpl implements CartitemDAO {
	
	 @Autowired
	    private SessionFactory sessionFactory;

	    public void addCartItem(Cartitem cartItem) {
	        Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(cartItem);
	        session.flush();
	    }

	    public void removeCartItem (Cartitem cartItem) {System.out.println(cartItem);
	        Session session = sessionFactory.getCurrentSession();
	        session.delete(cartItem);
	        session.flush();
	    }

	    public void removeAllCartItems(Cart cart) {
	        List<Cartitem> cartItems = cart.getCartItems();
	        System.out.println("4");
	        for (Cartitem item : cartItems) {
	            removeCartItem(item);
	        }
	    }

	    public Cartitem getCartItemByCiId (int ciid) {
	        Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from Cartitem where ciid = ?");
	        query.setInteger(0, ciid);
	        session.flush();

	        return (Cartitem) query.uniqueResult();
	    }
	    
	    public List<Cartitem> getCartItemByProductId (int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from Cartitem where pid = ?");
	        query.setInteger(0, id);
	        session.flush();
	        System.out.println(query);
	        List<Cartitem> cartitem= query.list();
	        return cartitem;
	    }
	    public void removeCartItemList (List<Cartitem> cartItem) {
        Session session = sessionFactory.getCurrentSession();
        for (Cartitem item : cartItem) {
            removeCartItem(item);
        }
        
        session.flush();
    }
		public List<Cartitem> getCartItemByCartId(int cartid){
			  Session session = sessionFactory.getCurrentSession();
		        Query query = session.createQuery("from Cartitem where cartid = ?");
		        query.setInteger(0, cartid);
		        session.flush();
		        List<Cartitem> cartitem= query.list();
		        return cartitem;
		}

}

