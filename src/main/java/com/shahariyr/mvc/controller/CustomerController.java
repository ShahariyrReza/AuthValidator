package com.shahariyr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.shahariyr.mvc.entity.customer;

@Controller
public class CustomerController {

	@GetMapping("/")
	public String showform(Model theModel) {

		theModel.addAttribute("customer", new customer()); // "customer" is the model name. Which has to be same as the thymeleaf file.

		return "Customer-form";
	}
}
