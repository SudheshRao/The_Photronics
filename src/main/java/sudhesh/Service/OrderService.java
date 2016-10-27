package sudhesh.Service;

import sudhesh.model.Order;

public interface OrderService {
	
	public void addCustomerOrder(Order customerOrder);
	
	public double getCustomerOrderGrandTotal(int cartId);

}
