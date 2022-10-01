package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.RegisterModel;
import com.gcu.service.ScheduleServiceInterface;
import com.gcu.model.LoginModel;
import com.gcu.model.EventModel;



@Controller
@Primary
@RequestMapping ("/home")
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
	public String dispHome(Model homeMod) {
		homeMod.addAttribute("Title", "Home");
		return "home";
	}
	/**
	 * This is REGISTER
	 * @param model
	 * @return
	 */
	/**@GetMapping("/register")
	@PostMapping("/register")
	public Class<RegisterController> dispReg(Class<RegisterController> dispReg) {
		new RegisterController() dispReg = RegisterController.class;
		return dispReg;
	} */
	//@GetMapping("/register")
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
	
	/**@GetMapping("/login")
	@PostMapping("/login")
	public Class<LoginController> dispLog(Class<LoginController> dispLog) {
		new LoginController();
		dispLog = LoginController.class;
		return dispLog;
	 }*/
	
	//TO CREATE /HOME/LOGIN/DOLOGIN/
	@PostMapping("/doLogin")
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
	
	//TO CREATE HOME/REGISTER
	@PostMapping("/doRegister")
	public String doLogin(@Valid RegisterModel registerModel, BindingResult bindingResult, Model model) {
		
		//check validation
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "register form");
			return "register";
		}

		//standard page attributes
		model.addAttribute("My Events", "EventModel");
		model.addAttribute("events", service.getEvents());  //including the service function
		
		//Navigate back
		return "events"; 
		
	}
}
