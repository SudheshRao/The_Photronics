package sudhesh.DAO;

import java.util.List;

import sudhesh.model.CustomerSignup;

/*
 * Customer Signup DAO Interface
 * created by sudhesh rao p 
 */

public interface CustomerSignupDAO {

	void addCustomer(CustomerSignup p);
	
	 public CustomerSignup getCustomerById (int customerId);
	 
	 public List<CustomerSignup> getAllCustomers();
	 
	 public CustomerSignup getCustomerByUsername(String username);
}
