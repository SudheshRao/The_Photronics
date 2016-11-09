package sudhesh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sudhesh.Service.SearchService;
import sudhesh.model.Product;

@Controller
public class SearchController {

	@Autowired
	private SearchService ss;
	

	@RequestMapping(value="/search")
	public String Search(Model model,HttpServletRequest request){
		System.out.println(request.getParameter("value"));
		
		
		List<Product> product=ss.search(request.getParameter("value"));
		model.addAttribute("viewpro", product);
		
		return "userviewproduct";
		
	}
}
