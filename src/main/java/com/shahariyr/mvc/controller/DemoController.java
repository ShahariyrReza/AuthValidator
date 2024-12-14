package com.shahariyr.mvc.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shahariyr.mvc.entity.LoginCustomer;
import com.shahariyr.mvc.entity.customer;
import jakarta.validation.Valid;

@Controller
public class DemoController {

	// For Trim the empty space of a required field.
	// Here last name is required but if any user fill the field with "space" then
	// it will not pass the validation.
	@InitBinder
	public void initbinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	// Get mapping for sign up page
	@GetMapping("/signup")
	public String showSignUpform(Model theModel) {

		theModel.addAttribute("customer", new customer());// "customer" is the model name.also HTML page object
		// Which has to be same as the template file object.

		return "signup";
	}

	// get mapping for log in page
	@GetMapping("/login")
	public String showLogInform(Model theModel1) {

		theModel1.addAttribute("LoginCustomer", new LoginCustomer());// "LoginCustomer" is the model name.also HTML page
																		// object
		// Which has to be same as the template file object.

		return "login";
	}

	// process form for login page;
	@PostMapping("/processLoginForm")
	public String processForm(@Valid @ModelAttribute("LoginCustomer") LoginCustomer theLoginCustomer,
			BindingResult theBindingResult) {

		if (theBindingResult.hasErrors()) {
			return "login";
		} else {
			return "processForm";
		}
	}

	// process form for sign up page;
	@PostMapping("/processSignupForm")
	public String processForm(@Valid @ModelAttribute("customer") customer theCustomer, BindingResult theBindingResult) {

		if (theBindingResult.hasErrors()) {
			return "signup";
		} else {
			return "processForm";
		}
	}
}
