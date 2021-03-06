package fr.formation.springmvc.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//http://localhost:8088/Spring-MVC
@Controller
@RequestMapping("")
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

	
//	@RequestMapping("/loginprocess")
//	//http://localhost:8088/Spring-MVC/loginprocess
//	public String formProcess(HttpServletRequest request, Model model) {
//		
//		// get data from my form
//		String userName = request.getParameter("user");
//		String password = request.getParameter("pass");
//		////////////////////////////////////////////
//		
//		String newUserName = "(username = " + userName.toUpperCase() + " )";
//		String newPassword = "(password = " + password + " )";
//		
//		//utilisation du Model => doing process in data
//		model.addAttribute("myUserName", newUserName);
//		model.addAttribute("myPassword", newPassword);
//		
//		
//		return "info";
//		
//	}
	
	@RequestMapping("/loginprocess")
	//http://localhost:8088/Spring-MVC/loginprocess
	public String formProcess(@RequestParam("user") String userName,  
			@RequestParam("pass") String password , Model model) {
		
		String newUserName = "(username = " + userName.toUpperCase() + " )";
		String newPassword = "(password = " + password + " )";
		
		//utilisation du Model => doing process in data
		model.addAttribute("myUserName", newUserName);
		model.addAttribute("myPassword", newPassword);
		
		return "info";
		
	}
	

}
