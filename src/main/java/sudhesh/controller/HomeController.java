package sudhesh.controller; 



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sudhesh.model.CustomerLogin;



@Controller
public class HomeController {
	
	//home page mapping
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    
    @RequestMapping("/intro")
    public String intro() {
        return "intro";
    }
    
    //login page mapping
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required = false) String error, Model model) {
        if (error!=null) {
            model.addAttribute("error", "Invalid username and password");
        }

        return "login";
    }

    
    //login execution code
  /* @RequestMapping(value="/login" , method=RequestMethod.GET)
    public String login(Model model) {
    	model.addAttribute("loginForm", new CustomerLogin());
        return "intro";
    }*/



}
