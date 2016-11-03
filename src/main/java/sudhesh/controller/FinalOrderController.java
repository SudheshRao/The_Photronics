package sudhesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import sudhesh.Service.CartService;
import sudhesh.Service.OrderService;
import sudhesh.Service.ProductService;
import sudhesh.model.Cart;
import sudhesh.model.CustomerSignup;
import sudhesh.model.FinalOrder;
import sudhesh.model.Order;
import sudhesh.model.Product;

public class FinalOrderController {
	  @Autowired
	    private static CartService cartService;

	    @Autowired
	    private static OrderService os;
	    
	    @Autowired
	    private static ProductService ps;
	    
	    public static void createOrder(Order t2){
	    		    	    FinalOrder order = new FinalOrder();    		 
	    	        		Cart cart = cartService.getCartByCartId(t2.getCart().getCartid());
	     	    	     
	    	        CustomerSignup customer = cart.getCustomer();
	    	        order.setCustomername(customer.getUsername());
	    	        order.setDeliveryadrress(customer.getAddress());
	    	        

	    	        	Product p = ps.getProductById(t2.getPid());
	    	        	order.setPid(p.getId());
	    	        	order.setManufacturer(p.getCompany());
	    	        	order.setModel(p.getModel());
	    	        	order.setInstrument(p.getInstrument());
	    	        	order.setQuant(t2.getQuant());
	    	        	 
	    	        	os.addfinalorder(order);
	    	        	
	    	        	}
}