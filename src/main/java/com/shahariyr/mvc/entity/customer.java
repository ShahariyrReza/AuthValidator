package com.shahariyr.mvc.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class customer {

	/*
	 * Here four field defined for login page userName, email, monileNumber,
	 * password
	 * 
	 */

	@NotNull(message = "required User Name")
	private String userName;

	@NotNull(message = "required") // last name can't be null
	@Size(min = 1, message = "required")
	@Email
	private String email;

	@Size(min = 11, max = 14, message = "use a valid phone number")
	@Pattern(regexp = "^[+\\d]+$", message = "use a valid phone number")
	private String mobileNumber;

	@NotNull(message = "Required Password")
	// @NotBlank(message = "Required Password")
	@Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
	// @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d){8,}$",
	// message = "Password must have at least one upper case letter, one lower case
	// letter, one number, and one special character")
	private String password;
	
	

	/* Getter Setter method correspondingly */

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
