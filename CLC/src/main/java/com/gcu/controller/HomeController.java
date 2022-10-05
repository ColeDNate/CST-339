package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.EventModel;
import com.gcu.model.LoginModel;
import com.gcu.model.RegisterModel;
import com.gcu.service.ScheduleServiceInterface;



@Controller
@Primary
@RequestMapping ("/scheduler")
public class HomeController {
	
	
	/*** VARIABLES ***/
	@Autowired
	private ScheduleServiceInterface service;
	
	
	
	/**
	 * This is HOME
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String displayHome(Model model) {
		model.addAttribute("Title", "Home");
		return "home";
	}
	/**
	 * This is REGISTER
	 * @param model
	 * @return
	 */
	@PostMapping("/register")
	public String displayRegister(Model model) {
		model.addAttribute("Title", "Register");
		model.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	/**
	 * This is LOGIN
	 * @param model
	 * @return
	 */
	@PostMapping("/login")
	public String displayLogin(Model model) {
		model.addAttribute("Title", "Login");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	} 
	
	//Redirects to home/events
	@RequestMapping("/events")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		//check validation
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "login form");
			return "login";
		}
		
		//standard page attributes
		model.addAttribute("My Events", "EventModel");
		model.addAttribute("events", service.getEvents());  //including the service function
		
		//Navigate back
		return "events";
	}
	
	
	/* Add Event Notes: ---
	 * error 1 resolved: Eventmodel eventModel ties to the HTML th:object="eventModel"
	 * error 2 resolved: maping was weird. Forgot what I did but I changed something to make it work
	 * error 3 unresolved: addEvent does not work as intended
	 * TODO: Link the form from the html page to the addEvent function
	 */

	//Redirects to home/events
	@PostMapping("/addEvent")
	public String addEvent(@Valid EventModel eventModel, BindingResult bindingResult, Model model) {
		
		//check validation
		if(bindingResult.hasErrors()) {
			model.addAttribute("Add title", "add form");
			return "addEvent";
		}
		
		//standard page attributes
		model.addAttribute("SomeEvent", "EventModel");
		model.addAttribute("newEvent", service.addEvent());  //including the service function
		
		
		//Navigate back
		return "addEvent";
	}
	
}
