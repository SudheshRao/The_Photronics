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

import sudhesh.DAO.CustomerSignupServiceimpl;
import sudhesh.model.CustomerSignup;

@Controller
public class SignupController {


	@Autowired 
	CustomerSignupServiceimpl customerService;
	
	@Qualifier(value="customerService")
	public void setCustomerService(CustomerSignupServiceimpl cs) {
		this.customerService = cs;
	}

	 @RequestMapping(value="/signup" , method=RequestMethod.GET)
	    public String signup(Model model) {
	    	model.addAttribute("signupForm", new CustomerSignup());
	        return "signup";
	    }
	    
	    @RequestMapping(value="/signup" , method=RequestMethod.POST)
	    public String signupsuccess(@Valid @ModelAttribute ("signupForm") CustomerSignup customersignup, BindingResult result){
	    	if (result.hasErrors()){
	    		return "signup";}
	    	else { 
	    		this.customerService.addCustomer(customersignup);
	    		   return "index";	
	    	}
	     
	    }
}