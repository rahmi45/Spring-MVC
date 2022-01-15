package fr.formation.springmvc.student;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.formation.springmvc.model.Student;

//http://localhost:8088/Spring-MVC/studentMvcTags
@Controller
@RequestMapping("studentMvcTags")
public class StudentControllerMvcTags {
	//http://localhost:8088/Spring-MVC/studentMvcTags/accountMvcTags
	@RequestMapping("/accountMvcTags")
	public String studentFormMvcTags(Model model) {
		Student student = new Student();
		model.addAttribute("student" , student);
		return "student-front-mvc-tags/studentAccount";
	}
	
	@RequestMapping("/processMvcTags")
	public String showInfoDataStudent(@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "student-front-mvc-tags/studentAccount";
		} else {
			return "student-front-mvc-tags/showDataStudent";
		}
		
	}
	//preprocess
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

}
