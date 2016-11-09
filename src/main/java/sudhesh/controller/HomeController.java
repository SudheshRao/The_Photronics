package sudhesh.controller; 

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Home controller
 * created by sudhesh rao p 
 */


@Controller
public class HomeController {
	
	//home page mapping
    @RequestMapping("/")
    public String home() {
    	
        return "index";
    }
   
    //login page mapping
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required = false) String error, Model model) throws IOException {
    	
        if (error!=null) {
            model.addAttribute("error", "Invalid username and password");
        }
        
        return "login";
    }
}
