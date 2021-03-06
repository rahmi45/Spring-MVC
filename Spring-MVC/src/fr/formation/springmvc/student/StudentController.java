package fr.formation.springmvc.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.formation.springmvc.model.Student;


//http://localhost:8088/Spring-MVC/student
@Controller
@RequestMapping("student")
public class StudentController {
	//http://localhost:8088/Spring-MVC/student/account
	@RequestMapping("/account")
	public String studentForm() {
		return "student-front/studentAccount";
	}
	
	@RequestMapping("/studentprocess")
	public String getDataStudent(@RequestParam("fname") String fname, 
			@RequestParam("lname") String lname, 
			@RequestParam("age") String age, Model model) {
		
		Student student = new Student();
		
		student.setFirstName(fname);
		student.setLastName(lname);
		student.setAge(age);
		
		model.addAttribute("myStudent", student);
		
		return "student-front/showDataStudent";
	}

}
