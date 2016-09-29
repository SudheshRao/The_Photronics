package sudhesh.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.model.CustomerSignup;

@Service
public class CustomerSignupServiceimpl {
	
	     
		@Autowired
	    private CustomerSignupDAOimpl customerDAO;
	 
	    public void setPersonDAO(CustomerSignupDAOimpl productDAO) {
	        this.customerDAO = productDAO;
	    }
	 
	   
	   @Transactional
	    public void addCustomer(CustomerSignup p) {
	        this.customerDAO.addCustomer(p);
	    }
	}


