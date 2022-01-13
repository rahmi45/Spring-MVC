package fr.formation.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	//http://localhost:8088/Spring-MVC/
	public String main() {
		return "mainPage";
		
	}
	@RequestMapping("/profile")
	//http://localhost:8088/Spring-MVC/profile
	public String myPro() {
		return "myProfile";
		
	}

	@RequestMapping("/signIn")
	//http://localhost:8088/Spring-MVC/signIn
	public String myLogin() {
		return "login";
		
	}
	
	@RequestMapping("/loginprocess")
	//http://localhost:8088/Spring-MVC/loginprocess
	public String formProcess() {
		return "info";
		
	}
	

}
