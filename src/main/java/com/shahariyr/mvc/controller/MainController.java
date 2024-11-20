package com.shahariyr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {

	@GetMapping("/hello")
	public String sayhello(Model theModel) {
		
		theModel.addText("Shahariyr Reza");
		return "helloworld";
	}
}
