package sudhesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sudhesh.Service.CartService;
import sudhesh.model.Cart;
import sudhesh.model.CustomerSignup;
import sudhesh.model.Order;


@Controller
public class OrderController {
	
	@Autowired
    private CartService cartService;

    @Autowired
    private sudhesh.Service.OrderService OrderService;

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
        Order customerOrder = new Order();
        Cart cart=cartService.getCartById(cartId);
        customerOrder.setCart(cart);

        CustomerSignup customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        

        OrderService.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId="+cartId;
    }

}
