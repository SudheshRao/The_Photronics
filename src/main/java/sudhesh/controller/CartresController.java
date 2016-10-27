package sudhesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import sudhesh.Service.CartService;
import sudhesh.Service.CartitemService;
import sudhesh.Service.CustomerSignupService;
import sudhesh.Service.ProductService;
import sudhesh.model.Cart;
import sudhesh.model.Cartitem;
import sudhesh.model.CustomerSignup;
import sudhesh.model.Product;


@Controller
@RequestMapping("/res/cart")
public class CartresController {
	
	 @Autowired
	    private CartService cartService;

	    @Autowired
	    private CartitemService cartItemService;

	    @Autowired
	    private CustomerSignupService customerService;

	    @Autowired
	    private ProductService productService;

	    @RequestMapping("/{cartid}")
	    public @ResponseBody
	    Cart getCartById (@PathVariable(value = "cartid") int cartid) {System.out.println("1");
	        return cartService.getCartById(cartid);
	    }

	    @RequestMapping(value = "/add/{id}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void addItem (@PathVariable(value ="id") int id) {
	    	try{ User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    	
	        CustomerSignup customer = customerService.getCustomerByUsername(user.getUsername());
	        Cart cart = customer.getCart();
	        Product product = productService.getProductById(id);
	        List<Cartitem> cartItems = cart.getCartItems();

	        for (int i=0; i<cartItems.size(); i++) {
	            if(product.getId()==cartItems.get(i).getProduct().getId()){
	                Cartitem cartItem = cartItems.get(i);
	                cartItem.setQuantity(cartItem.getQuantity()+1);
	                cartItem.setTotal(product.getCost()*cartItem.getQuantity());
	                cartItemService.addCartItem(cartItem);
	                return;
	            }
	        }

	        Cartitem cartItem = new Cartitem();
	        cartItem.setProduct(product);
	        cartItem.setQuantity(1);
	        cartItem.setCid(cart.getCartid());
	        cartItem.setTotal(product.getCost()*cartItem.getQuantity());
	        cartItem.setCart(cart);
	        cartItemService.addCartItem(cartItem);
	    }catch(Exception ex)
	    {

	    	System.out.println("Exception : " + ex.getMessage());
	    }
	    }

	    @RequestMapping(value = "/remove/{ciid}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void removeItem (@PathVariable(value = "ciid") int ciid) {
	    	
	        Cartitem cartItem = cartItemService.getCartItemByCiId(ciid);
	        cartItemService.removeCartItem(cartItem);

	    }

	    @RequestMapping(value = "/clear/{cartid}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void clearCart(@PathVariable(value = "cartid") int cartid) {System.out.println("2");
	        Cart cart = cartService.getCartById(cartid);System.out.println("3");
	        cartItemService.removeAllCartItems(cart);
	    }

	    @ExceptionHandler(IllegalArgumentException.class)
	    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload.")
	    public void handleClientErrors (Exception e) {}

	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error.")
	    public void handleServerErrors (Exception e) {}
}
