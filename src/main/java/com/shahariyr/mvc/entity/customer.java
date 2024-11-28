package com.shahariyr.mvc.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class customer {

	private String firstName;

	@NotNull(message = "required lastname") // last name can't be null
	@Size(min = 1, message = "required lastname")
	private String lastName;

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
