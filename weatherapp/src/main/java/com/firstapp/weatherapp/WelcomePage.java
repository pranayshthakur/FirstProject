package com.firstapp.weatherapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePage {
	@GetMapping("/welcome")
	public String welcome() {
		return "my first project";
	}
	

}
