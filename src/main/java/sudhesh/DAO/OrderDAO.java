package sudhesh.DAO;


import java.util.List;

import sudhesh.model.Order;

public interface OrderDAO {

	public void addCustomerOrder(Order order);

	public List<Order> getOrderByCartId(int cartid);

	public void deleteOrder(Order order);

}
