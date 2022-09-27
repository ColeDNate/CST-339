package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.RegisterModel;
import com.gcu.model.LoginModel;
import com.gcu.model.EventModel;
import com.gcu.model.HomeModel;
import com.gcu.controller.LoginController;
import com.gcu.controller.RegisterController;



@Controller
@RequestMapping ("/home")
public class HomeController {
	/**
	 * This is HOME
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String dispHome(Model homeMod) {
		homeMod.addAttribute("Title", "Home");
		homeMod.addAttribute("homeModel", new HomeModel());
		return "home";
	}
	
	@PostMapping("/register")
	public String dispReg(Model logMod) {
		logMod.addAttribute("Title", "Register");
		logMod.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	/**
	 * This is LOGIN
	 * @param model
	 * @return
	 */
	//@GetMapping("/login")
	@PostMapping("/login")
	public String dispLog(Model logMod) {
		logMod.addAttribute("Title", "Login");
		logMod.addAttribute("loginModel", new LoginModel());
		return "login";
	} 
	
	
	//TO CREATE /HOME/LOGIN/DOLOGIN/
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		//check validation
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "login form");
			return "login";
		}
		
		
		//create some orders
		List<EventModel> events = new ArrayList<EventModel>();
		events.add(new EventModel("Event 1", 2023, 1, 1));
		events.add(new EventModel("Event 2", 2023, 2, 2));
		events.add(new EventModel("Event 3", 2023, 3, 3));
		events.add(new EventModel("Event 4", 2023, 4, 4));

		model.addAttribute("My Events", "EventModel");
		model.addAttribute("events", events);
		
		//Navigate back
		return "events";
		
	}
}
