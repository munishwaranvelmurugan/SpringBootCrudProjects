package com.example.Resume.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Resume.Model.RegisterDetailsDB;
import com.example.Resume.Service.SqlService;

@Controller
public class LoginController {
    @Autowired
	private SqlService sqlService;

	@PostMapping("/RegisterDetails")
	public String RegisterDetails(
			@RequestParam("name")String name,
			@RequestParam("email")String email,
			@RequestParam("gender")String gender,
			@RequestParam("department")String department,
			@RequestParam("phoneNo")String phoneNo,
			@RequestParam("doorNo")String doorNo,
			@RequestParam("country")String country,
			@RequestParam("state")String state,
			@RequestParam("distric")String distric,
			@RequestParam("pinCode")String pinCode,
			@RequestParam("date")String date,
			@RequestParam("password1")String password1,
			@RequestParam("password2")String password2
			
			)	
	{
RegisterDetailsDB rs=new RegisterDetailsDB(
		0,name,email,gender,department,Long.parseLong(phoneNo),doorNo
		,country,state,distric,Integer.parseInt(pinCode),date,password1,
		password2);

sqlService.SaveTheUser(rs);
		return "index";
	}
    
    
	@PostMapping("/Login")
	public String welcome(@RequestParam("Email")String email,
			@RequestParam("Password")String pass,
			Model model) {
		RegisterDetailsDB a[]=new RegisterDetailsDB[1];
	if(sqlService.ValidateUser(email, pass,a)) { 
		System.out.println(email+" "+pass);
		
		model.addAttribute("NAME" 	, a[0].getName());
		
		return "UserPage";
	}
	model.addAttribute("errorMessage", "Invalid ID or password");
	return "SignIn";	
	}
	
}
