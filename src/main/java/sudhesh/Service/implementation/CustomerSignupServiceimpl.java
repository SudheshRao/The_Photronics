package sudhesh.Service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.CustomerSignupDAO;
import sudhesh.Service.CustomerSignupService;
import sudhesh.model.CustomerSignup;

/*
 * Customer Signup Service Implementation
 * created by sudhesh rao p 
 */

@Service
public class CustomerSignupServiceimpl implements CustomerSignupService {
	
	     
		@Autowired
	    private CustomerSignupDAO customerDAO;
	 
	    public void setPersonDAO(CustomerSignupDAO productDAO) {
	        this.customerDAO = productDAO;
	    }
	 
	   //customer sign up service implementation
	   @Transactional
	    public void addCustomer(CustomerSignup p) {
	        this.customerDAO.addCustomer(p);
	    }
	}


