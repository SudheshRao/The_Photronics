package sudhesh.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.CustomerSignupDAO;
import sudhesh.model.Authorities;
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
        cl.setUsername(p.getUsername());
        cl.setPassword(p.getPassword());
        cl.setId(p.getId());
        session.persist(cl);
        
        // entering authority to the customer in authorities table
        Authorities a = new Authorities();
        a.setUsername(p.getUsername());
        a.setAuthority("ROLE_USER");
        a.setId(p.getId());
        session.saveOrUpdate(a);

        session.flush();
        
        logger.info("Customer saved successfully, Customer Details="+p);
    }
 


}