package sudhesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sudhesh.Service.CustomerSignupService;
import sudhesh.model.CustomerSignup;


@Controller
@RequestMapping("/cart")
public class CartController {
	
	 @Autowired
	    private CustomerSignupService cs;

	    @RequestMapping
	    public String getCart(@AuthenticationPrincipal User activeUser){
	        CustomerSignup customer = cs.getCustomerByUsername (activeUser.getUsername());
	        int cartid = customer.getCart().getCartid();
	        System.out.println("View Cart in Get Cart"+cartid);
	        return "redirect:/cart/"+cartid;
	    }

	    @RequestMapping("/{cartid}")
	    public String getCartRedirect(@PathVariable (value = "cartid") int cartid, Model model) {
	        model.addAttribute("cartid", cartid);
	        System.out.println("View Cart in Get Cart Redirect");
	        return "cart";
	    }

}
