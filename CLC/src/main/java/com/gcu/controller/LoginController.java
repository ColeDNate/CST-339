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

import com.gcu.ScheduleInterface;
import com.gcu.model.EventModel;
import com.gcu.model.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController implements ScheduleInterface {
	
	/**
	 * this is the base page for logging in
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String display(Model model) {
		
		//;return string
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	
	/**
	 * After successfully logging in this page will be displayed
	 * @param loginModel
	 * @param bindingResult
	 * @param model
	 * @return
	 */
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
