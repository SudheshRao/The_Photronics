package sudhesh.DAO.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import sudhesh.DAO.CustomerSignupDAO;
import sudhesh.model.Address;
import sudhesh.model.Authorities;
import sudhesh.model.Cart;
import sudhesh.model.CustomerLogin;
import sudhesh.model.CustomerSignup;

/*
 * Customer Signup DAO Implementation
 * created by sudhesh rao p 
 */

@Repository
@Transactional
public class CustomerSignupDAOimpl implements CustomerSignupDAO {
	
    private static final Logger logger = LoggerFactory.getLogger(CustomerSignupDAOimpl.class);
	 
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
 
    //customer sign-up DAO implementation
    public void addCustomer(CustomerSignup p)
    {
        Session session = this.sessionFactory.getCurrentSession();
        
        // persisting customer to customer table
        session.persist(p);
        
        //persisting customers name and password to customer login table
        CustomerLogin cl=new CustomerLogin();
        p.setUser(cl);
        cl.setCs(p);
        cl.setUsername(p.getUsername());
        cl.setPassword(p.getPassword());
        session.persist(cl);
        
        // entering authority to the customer in authorities table
        Authorities a = new Authorities();
        a.setUsername(p.getUsername());
        a.setAuthority("ROLE_USER");
        a.setId(p.getId());
        session.saveOrUpdate(a);
        
        //entering cart id to the customer
        Cart cart = new Cart();
		p.setCart(cart);
		cart.setCustomer(p); 
		session.saveOrUpdate(cart);
		
		//entering address into adress table
		Address ad=new Address();
		p.setAdrs(ad);
		ad.setCs(p);
		ad.setAddress(p.getAddress());
		session.saveOrUpdate(ad);

        session.flush();
        
        logger.info("Customer saved successfully, Customer Details="+p);
    }
 
    public CustomerSignup getCustomerById (int customerId) {
        Session session = sessionFactory.getCurrentSession();
        return (CustomerSignup) session.get(CustomerSignup.class, customerId);
    }

    public List<CustomerSignup> getAllCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from customer");
        List<CustomerSignup> customerList = query.list();

        return customerList;
    }

    public CustomerSignup getCustomerByUsername (String username) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CustomerSignup where username = :un");
        query.setParameter("un", username);
        CustomerSignup customer = (CustomerSignup) query.uniqueResult();
        session.flush();
        return customer;
    }

}
