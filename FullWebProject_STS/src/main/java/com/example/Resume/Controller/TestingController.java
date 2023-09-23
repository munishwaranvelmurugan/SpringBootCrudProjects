package com.example.Resume.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestingController {

	@GetMapping("/validateJs")
	public String ValidateJs() {
		return "UserValidationJs";
	}
}
