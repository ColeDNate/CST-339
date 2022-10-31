package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class RegisterModel {
	
	/***** VARIABLES *****/
	
	//first name
	@NotNull(message="First name is a required field")
	@Size(min=1, max=32, message="First name must be between 1 and 32 characters")
	private String firstName;
	
	//last name
	@NotNull(message="Last name is a required field")
	@Size(min=1, max=32, message="Last name must be between 1 and 32 characters")
	private String lastName;
	
	//email
	@NotNull(message="Email is a required field")
	@Size(min=1, max=32, message="Email must be between 1 and 32 characters")
	private String email;
	
	//address
	@NotNull(message="Address is a required field")
	@Size(min=1, max=32, message="Address must be between 1 and 32 characters")
	private String address;
	
	//phone number
	@NotNull(message="Phone number is a required field")
	@Size(min=10, max=11, message="Phone number must be between 10 and 11 characters")
	private String phoneNumber;
	
	//user name
	@NotNull(message="user name is a required field")
	@Size(min=1, max=32, message="User name must between 1 and 32 characters")
	private String username;
	
	//password
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	
	
	/***** FUNCTIONS *****/
	
	//First name
	/**
	 * setter
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getter
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	
	//Last name
	/**
	 * setter
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getter
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	
	//Email
	/**
	 * setter
	 * @param email
	 */
	public void setEmail(String email) {
		this.email= email;
	}
	/**
	 * getter
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	//Address
	/**
	 * setter
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * getter
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	//Phone number
	/**
	 * setter
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * getter
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	//user name
	/**
	 * setter
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * getter
	 * @return
	 */
	public String getUsername() {
		return username;
	}
	
	//Password
	/**
	 * setter
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * getter
	 * @return
	 */
	public String getPassword() {
		return password;
	}

}
