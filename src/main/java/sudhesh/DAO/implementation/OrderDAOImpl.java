package sudhesh.DAO.implementation;

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

     public void addCustomerOrder(Order customerOrder) {
         Session session = sessionFactory.getCurrentSession();
         session.saveOrUpdate(customerOrder);
         session.flush();
     }

}
