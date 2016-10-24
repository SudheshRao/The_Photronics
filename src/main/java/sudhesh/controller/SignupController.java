package sudhesh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import sudhesh.Service.CustomerSignupService;
import sudhesh.model.CustomerSignup;

/*
 * Signup controller
 * created by sudhesh rao p 
 */

@Controller
public class SignupController {


	@Autowired 
	CustomerSignupService customerService;
	
	@Qualifier(value="customerService")
	public void setCustomerService(CustomerSignupService cs) {
		this.customerService = cs;
	}
	
	//sign-up page code
	 @RequestMapping(value="/signup" , method=RequestMethod.GET)
	 public String signup(Model model) {
	    	model.addAttribute("signupForm", new CustomerSignup());
	        return "signup";
	    }
	 
	 //sign-up execution code
	 @RequestMapping(value="/signup" , method=RequestMethod.POST)
	  public String signupsuccess(@Valid @ModelAttribute ("signupForm") CustomerSignup customersignup, BindingResult result){
	    	
		 if (result.hasErrors()){
	    		return "signup";}
	    	else { 
	    		this.customerService.addCustomer(customersignup);
	    		   return "redirect:/";	
	    	}
	     
	    }
}
