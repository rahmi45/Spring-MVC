package fr.formation.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8088/Spring-MVC/process
@Controller
@RequestMapping("/process")
public class ProcessData {
	
	@RequestMapping("/signIn")
	//http://localhost:8088/Spring-MVC/signIn
	public String myLogin() {
		return "login";
		
	}

}
