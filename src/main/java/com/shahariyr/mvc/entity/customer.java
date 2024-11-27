package com.shahariyr.mvc.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class customer {

	private String firstName;

	@NotNull(message = "required lastname") // last name can't be null
	@Size(min = 1, message = "required lastname")
	private String lastname;

	// Define only getter setter for validation a form.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
