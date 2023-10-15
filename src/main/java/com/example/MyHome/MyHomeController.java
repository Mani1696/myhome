package com.example.MyHome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHomeController {
	@Autowired
	@GetMapping(value="/Get")
	public String get() {
		return "Hello Friends";
	}

}
