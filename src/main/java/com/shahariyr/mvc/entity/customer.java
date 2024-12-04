package com.shahariyr.mvc.entity;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class customer {

	private String firstName;

	@NotNull(message = "required lastname") // last name can't be null
	@Size(min = 1, message = "required lastname")
	private String lastName;
	
	@Min(value = 0, message = "minimum Id number is getter that 0")
	@Max(value = 10, message = "max Id number is less that 10")
	private int customerId;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "5 string required")
	private String postalCode;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Define only getter setter for validation a form.

}
