package sudhesh.Service;

import java.util.List;

import sudhesh.model.CustomerSignup;

/*
 * Customer Signup Service Interface
 * created by sudhesh rao p 
 */

public interface CustomerSignupService {

	void addCustomer(CustomerSignup p);
	
	public CustomerSignup getCustomerById(int customerId);
	
	 public List<CustomerSignup> getAllCustomers();
	 
	 public CustomerSignup getCustomerByUsername (String username);
	 
}
