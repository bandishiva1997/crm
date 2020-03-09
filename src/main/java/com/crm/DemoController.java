package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService service;
	
	@GetMapping("/hello")
	public String hello() {
		return service.sayHello();
	}
	
}
