package com.billingservice.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/billingservice")
public class BillingService {
//	@Value("name")
//	String strMessage;
//	
	@GetMapping
	public String welcome() {
		return "programming microservices billing";
	}

//	
//	@GetMapping("/status")
//	public String status() {
//		return "Up and running->>";
//				
//	}

}
