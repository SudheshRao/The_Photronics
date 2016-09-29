package sudhesh.controller; 



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import sudhesh.model.CustomerLogin;



@Controller
public class HomeController {
	
	

    @RequestMapping("/")
    public String home() {
        return "index";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    
   
    
    
    @RequestMapping(value="/login" , method=RequestMethod.GET)
    public String login(Model model) {
    	model.addAttribute("loginForm", new CustomerLogin());
        return "login";
    }



}
