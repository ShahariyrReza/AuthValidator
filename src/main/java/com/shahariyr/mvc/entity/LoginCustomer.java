package com.shahariyr.mvc.entity;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class LoginCustomer {

	
	/* Two field for Log in page
	 * User name and password */
	
	@NotNull(message = "username required")
	private String username;

	
	@NotNull(message = "Enter Password")
	@Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
	private String password;


	
	/*Getter Setter method for Field*/
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
