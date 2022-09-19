package net.myschedule;

import java.util.Scanner;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.jdi.Method;



public class clcLoginModel {

		@NotNull(message = "username is a required field")
		@Size(min = 5, max = 40, message = "username must be between 5 and 40 characters ")
	private String username;
	
		@NotNull(message = "password is a required field")
		@Size(min = 7, max = 50, message = "password must be between 7 and 50 characters ")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

	
}