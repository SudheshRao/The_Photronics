package sudhesh.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import sudhesh.Service.CartService;
import sudhesh.Service.OrderService;
import sudhesh.Service.ProductService;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;
import sudhesh.model.CustomerSignup;
import sudhesh.model.Order;
import sudhesh.model.Product;

/*
 * Order controller
 * created by sudhesh rao p 
 */

@Controller
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService OrderService;
    
    @Autowired
    private ProductService ps;
    
    //Proceed to checkout action
    @RequestMapping("/order/{cartid}")
    public String createOrder(@PathVariable("cartid") final int cartid) {
      
    	//thread start the timer and ellapse function call
       Thread thread1 = new Thread() {
    	   
    	    public void run() {
    	    	
    	    	int carid=cartid;
    	    	int a=Counts.main(carid);
    	    	timeellapse(a);
    	    	
    	    }
    	};

    	//thread to add the cart items to the order table
    	Thread thread2 = new Thread() {
    		
    	    public void run() {
    	    	
    	    	 Order order = new Order();
    	         List<Cartitem> items=cartService.getCartItemByCartId(cartid);
    	    	
    	         for(Cartitem item:items){
    	      	   
    	    	        Cart cart=cartService.getCartById(cartid);
    	    	        order.setCart(cart);
    	    	        
    	    	        CustomerSignup customer = cart.getCustomer();
    	    	        order.setCustomer(customer);
    	    	        order.setCustomername(customer.getUsername());
    	    	        order.setDeliveryadrress(customer.getAddress());
    	    	        order.setBillingAddress(customer.getAdrs());
    	    	    
    	    	        	Product p = ps.getProductById(item.getPrid());
    	    	        	order.setPid(p.getId());
    	    	        	order.setManufacturer(p.getCompany());
    	    	        	order.setModel(p.getModel());
    	    	        	order.setInstrument(p.getInstrument());
    	    	        	order.setQuant(item.getQuantity());
    	    	        	order.setTotal(p.getCost());
    	    	        	p.setStock(p.getStock()-item.getQuantity());
    	    	        	ps.editProduct(p);
    	    	        	
    	    	        	OrderService.addCustomerOrder(order);
    	    	        	order.setCustomerOrderId(order.getCustomerorderid()+1);

    	    	        }
    	    }
    	};
       
      thread1.start();
      thread2.start();

        

        return "redirect:/checkout?cartid="+cartid;
    }

    //clear order and retain stock on time ellapse
	public void timeellapse(int cartid) {
		List<Order> orders=OrderService.getOrderByCartId(cartid);
        for(Order order:orders){
        	Product p = ps.getProductById(order.getPid());
        	p.setStock(p.getStock()+order.getQuant());
        	ps.editProduct(p);
        	OrderService.deleteOrder(order);
        	
		
        }        }

	

}

