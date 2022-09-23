package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.RegisterModel;
import com.gcu.model.LoginModel;
import com.gcu.model.HomeModel;


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
	/**
	 * This is REGISTER
	 * @param model
	 * @return
	 */
	@PostMapping("/register")
	public String dispReg(Model dispReg) {
		dispReg.addAttribute("Title", "Register");
		dispReg.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	/**
	 * This is LOGIN
	 * @param model
	 * @return
	 */
	@PostMapping("/login")
	public String dispLog(Model logMod) {
		logMod.addAttribute("Title", "Register");
		logMod.addAttribute("loginModel", new LoginModel());
		return "login";
	}
}
