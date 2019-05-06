package com.gontuseries.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gontuseries.business.Student;

@Controller
public class StudentController {

	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}
	
	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="name", defaultValue="abc") String name, @RequestParam(value="hobby", defaultValue="xyz") String hobby) {

		Student student1 = new Student();
		student1.setName(name);
		student1.setHobby(hobby);
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Details submitted by "+name+" having hobby "+hobby);
		modelAndView.addObject("student1", student1);
		return modelAndView;
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute("student1") Student student1, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Form submitted using ModelAttribute");
		return modelAndView;
	}
	
}
