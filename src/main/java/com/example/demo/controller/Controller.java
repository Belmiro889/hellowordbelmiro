package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping(value = "/hello")
	public String helloWord() {
		
		return "Hello Word: Belmiro Tobias Placido";
		
		
	}
	
	
}
