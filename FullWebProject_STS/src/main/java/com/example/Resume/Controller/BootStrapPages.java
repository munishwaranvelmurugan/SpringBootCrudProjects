package com.example.Resume.Controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Resume.Model.RegisterDetailsDB;
import com.example.Resume.Service.SqlService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/College")
public class BootStrapPages {
	
	 @Autowired
		private SqlService sqlService;
	 
	
	@PostMapping("/LoginUser")
	public String LoginUser(@RequestParam("Email")String id,
			@RequestParam("Password")String pass ,HttpServletRequest request) {
		if(sqlService.ValidateUser(id, pass, null)) {
			
			return "/Web/Main-D";
		}
		return "/Web/Login-D";
	}
	
	
   
	@RequestMapping("dq")
	public String dashboard() {
		return "/Web/Main-D";
	}
	
	@GetMapping("/Login-D")
	public String Login() {
		return "/Web/Login-D";
	}
	
	@GetMapping("/SignUp-D")
	public String SignUpPage() {
		return "/Web/SignUp-D";
	}
	
	@PostMapping("/NewUser")
	public String SaveTheUser() {
		System.out.println("Hello");
		return "/Web/Login-D";
	}
	
	

}
