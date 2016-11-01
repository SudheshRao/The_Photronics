package sudhesh.Service;

import java.util.List;

import sudhesh.model.Order;

public interface OrderService {
	
	public void addCustomerOrder(Order order);
	
	public double getCustomerOrderGrandTotal(int cartId);

	public List<Order> getOrderByCartId(int cartid);

	public void deleteOrder(Order order);

}
