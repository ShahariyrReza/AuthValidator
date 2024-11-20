package com.shahariyr.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shahariyr.mvc.entity.customer;

@Controller
public class MainController {

	@GetMapping("/")
	public String sayhello(Model theModel) {
		theModel.addAttribute("customer",new customer());
		
		
		return "Index";
	}
}
