package com.example.Resume.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ServerControl {
	@GetMapping("/temp")
	public String temp() {
		return "temp";
	}

	@GetMapping("/uploadImg")
	public String UploadImage() {
		return "UploadImg";
	}
	
	@GetMapping("/login")
	public String FrontPannel() {
		return "FrontPage";
	}
	
	@GetMapping("/sRegister")
	public String RegisterPage() {
		return "Register";
	}
	
	@GetMapping("/slogin")
	public String LoginPage() {
		return "SignIn";
	}
	
	@GetMapping("/a") 	
	public String index() {
		return "index";	
	}
	

}
