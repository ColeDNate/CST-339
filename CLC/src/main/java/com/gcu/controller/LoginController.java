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

import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	/**
	 * Simple Hello World Controller that returns a View Name along with a model attribute named message
	 * Invoke using /test2 URI
	 * @param model Model to bind to the View
	 * 
	 * @return View name hello
	 */
	@GetMapping("/")
	public String display(Model model) {
		
		//;return string
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		//check validation
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "login form");
			return "login";
		}
		
		
		//create some orders
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(01, "0000000001", "Product 1", 1.00f, 1));
		orders.add(new OrderModel(02, "0000000002", "Product 2", 2.00f, 2));
		orders.add(new OrderModel(03, "0000000003", "Product 3", 3.00f, 3));
		orders.add(new OrderModel(04, "0000000004", "Product 4", 4.00f, 4));
		orders.add(new OrderModel(05, "0000000005", "Product 5", 5.00f, 5));

		model.addAttribute("My Orders", "OrderModel");
		model.addAttribute("orders", orders);
		
		//print form values
		//System.out.println(String.format("Form with Username of %s and Password of %s", loginModel.getUsername(), loginModel.getPassword()) );
		
		//Navigate back
		return "orders";
		
	}

}
