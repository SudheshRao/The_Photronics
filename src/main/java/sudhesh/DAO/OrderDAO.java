package sudhesh.DAO;


import java.util.List;

import sudhesh.model.Cart;
import sudhesh.model.FinalOrder;
import sudhesh.model.Order;

public interface OrderDAO {

	public void addCustomerOrder(Order order);

	public List<Order> getOrderByCartId(int cartid);

	public void deleteOrder(Order order);

	public void addfinalorder(FinalOrder order);
	
    public void removeAllOrder(Cart cart);
    
    public void removeOrderItem (Order order);
    
    public boolean checkorder(Cart cart);


}
