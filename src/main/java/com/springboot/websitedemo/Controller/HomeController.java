package com.springboot.websitedemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/Home")
	public String Home() {
		return "hello";
	}
}
