package com.shahariyr.mvc.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class customer {

	
	/* Here four field defined for login page
	 * userName, email, monileNumber, password */
	
	@NotNull(message = "required User Name")
	private String userName;

	@NotNull(message = "required") // last name can't be null
	@Size(min = 1, message = "required")
	@Email
	private String email;

	@Min(value = 0, message = "Invalid mobile number")
	private Integer mobileNumber;

	@NotBlank(message = "Password cannot be blank")
	@Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
	private String password;
	
	
	

	/* Getter Setter method correspondingly*/
	
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
	

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
