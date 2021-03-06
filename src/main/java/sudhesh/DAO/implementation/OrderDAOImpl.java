package sudhesh.DAO.implementation;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.OrderDAO;

import sudhesh.model.Cart;
import sudhesh.model.CustomerSignup;
import sudhesh.model.FinalOrder;
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
    public void removeAllOrder(Cart cart) {
		Session session = sessionFactory.getCurrentSession();
		int cartid=cart.getCartid();
		
		Query query = session.createQuery("from Order where cartid = ?");
        query.setInteger(0, cartid);
		List<Order> orde = query.list();
        System.out.println("4");
        for (Order ord : orde) {
    	    FinalOrder order = new FinalOrder();    		 

        	 CustomerSignup customer = cart.getCustomer();
 	        order.setCustomername(customer.getUsername());
 	        order.setDeliveryadrress(customer.getAddress());

 	        	order.setPid(ord.getPid());
 	        	order.setManufacturer(ord.getManufacturer());
 	        	order.setModel(ord.getModel());
 	        	order.setInstrument(ord.getInstrument());
 	        	order.setQuant(ord.getQuant());
 	        	order.setTotal(ord.getTotal());
 	        	 
 	        	addfinalorder(order);
        	removeOrderItem(ord);
        }
     
    }
    public void removeOrderItem (Order order) {
    Session session = sessionFactory.getCurrentSession();
    session.delete(order);
    session.flush();
}
	public void addfinalorder(FinalOrder order){
		Session session = sessionFactory.getCurrentSession();
        session.save(order);
        session.flush();
	}
    public boolean checkorder(Cart cart){
    	Session session = sessionFactory.getCurrentSession();
		int cartid=cart.getCartid();
		
		Query query = session.createQuery("from Order where cartid = ?");
        query.setInteger(0, cartid);
		List<Order> orde = query.list();
		if(orde.size()>0)
			return true;
		else return false;
    }


}
