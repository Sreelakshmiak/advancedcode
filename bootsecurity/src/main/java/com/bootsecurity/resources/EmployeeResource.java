package com.bootsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

	@GetMapping("/")
	public String greet() {
		return "working";
	}
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Admin@word";
		
	}
	@GetMapping
	@RequestMapping("/user")
	public String greetUser() {
		return "User@work";
	}
}
