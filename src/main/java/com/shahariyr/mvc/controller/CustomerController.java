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

import com.shahariyr.mvc.entity.customer;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
	
	
	// For Trim the empty space of a required field.
	// Here last name is required but if any user fill the field with "space" then
	// it will not pass the validation.
	@InitBinder
	public void initbinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping("/")
	public String showform(Model theModel) {

		theModel.addAttribute("customer", new customer());// "customer" is the model name.
		// Which has to be same as the template file action.

		return "customer-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") customer theCustomer, BindingResult theBindingResult) {

		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "confirmation-page";
		}
	}
}
