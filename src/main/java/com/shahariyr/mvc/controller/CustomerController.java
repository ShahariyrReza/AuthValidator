package com.shahariyr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shahariyr.mvc.entity.customer;

import jakarta.validation.Valid;

@Controller
public class CustomerController {

	@GetMapping("/")
	public String showform(Model theModel) {

		theModel.addAttribute("customer", new customer());//"customer" is the model name. 
		//Which has to be same as the thymeleaf file action.

		return "customer-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") customer theCustomer, BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} 
		else {
			return "confirmation-page";
		}
	}
}
