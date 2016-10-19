package sudhesh.DAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import sudhesh.model.Authorities;
import sudhesh.model.CustomerLogin;
import sudhesh.model.CustomerSignup;


@Repository
@Transactional
public class CustomerSignupDAOimpl  {
	
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
        
        session.persist(p);
        
        CustomerLogin cl=new CustomerLogin();
        cl.setUsername(p.getUsername());
        cl.setPassword(p.getPassword());
        cl.setId(p.getId());
        session.persist(cl);
        
        Authorities a = new Authorities();
        a.setUsername(p.getUsername());
        a.setAuthority("ROLE_USER");
        a.setId(p.getId());
        session.saveOrUpdate(a);

        session.flush();
        
        logger.info("Customer saved successfully, Customer Details="+p);
    }
 


}
