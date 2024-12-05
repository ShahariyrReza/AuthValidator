package com.shahariyr.mvc.entity;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class customer {

	private String userName;

	@NotNull(message = "required") // last name can't be null
	@Size(min = 1, message = "required")
	@Email
	private String email;
	


	//@Min(value = 0, message = "minimum Id number is getter that 0")
	//@Max(value = 10, message = "max Id number is less that 10")
	private int customerId;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "5 string required")
	private String postalCode;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Define only getter setter for validation a form.

}
