package com.TCS.LearningManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome_Message {
	
	@GetMapping("/home")
	public String Welcome() {
		return "Welcome to My Project";
	}
}
