package net.myschedule;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.myschedule.clcLoginModel;

@Controller
@RequestMapping("/home")
public class clcLoginController {
	
	@GetMapping("/home")
	public String printHome() {
		
		return "/home";
		
	}
	/**@GetMapping("/")
	public String display(Model model) {
		
		model.addAttribute("title", "Home Page");
		
		model.addAttribute("clcLoginModel", new clcLoginModel());
		return "home";
		
	} */
	@PostMapping("/doLogin") 
	public String doLogin (@Valid clcLoginModel loginModel, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			
			model.addAttribute("title", "Login Form");
			return "home";
			
		}
		
		
	
		
		model.addAttribute("title", "Home Page");
		return "home";
			
	}
	
}