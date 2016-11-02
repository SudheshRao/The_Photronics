package sudhesh.DAO.implementation;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.OrderDAO;
import sudhesh.model.Order;

@Repository
@Transactional
public class OrderDAOImpl implements OrderDAO {
	
	 @Autowired
     private SessionFactory sessionFactory;

     public void addCustomerOrder(Order order) {
         Session session = sessionFactory.getCurrentSession();
         session.save(order);
         session.flush();
     }
 	public List<Order> getOrderByCartId(int cartid){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Order where cartid = ?");
        query.setInteger(0, cartid);
        List<Order> cartitem= query.list();
        session.flush();
        return cartitem;
 	
 	}
	public void deleteOrder(Order order){
		Session session = sessionFactory.getCurrentSession();
        session.delete(order);
        session.flush();
	}

	    
}
