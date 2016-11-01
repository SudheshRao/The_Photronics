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


@Controller
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService OrderService;
    
    @Autowired
    private ProductService ps;
    
    @RequestMapping("/order/{cartid}")
    public String createOrder(@PathVariable("cartid") int cartid) {
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
        	p.setStock(p.getStock()-item.getQuantity());
        	ps.editProduct(p);
        	
        	OrderService.addCustomerOrder(order);
        	order.setCustomerOrderId(order.getCustomerorderid()+1);

        }

        

        return "redirect:/checkout?cartid="+cartid;
    }

}
