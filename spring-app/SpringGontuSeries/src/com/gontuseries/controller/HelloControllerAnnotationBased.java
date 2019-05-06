package com.gontuseries.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/greet")
public class HelloControllerAnnotationBased {

	@RequestMapping("/welcome/{username}")
	public ModelAndView helloWorld(@PathVariable String username) {
		ModelAndView modelAndView = new ModelAndView("HelloWorld");
		modelAndView.addObject("welcomeMessage", "Hello World "+username);
		return modelAndView;
	}
	
	@RequestMapping("/goBack/{username}")
	public ModelAndView goBack(@PathVariable String username) {
		ModelAndView modelAndView = new ModelAndView("HelloWorld");
		modelAndView.addObject("welcomeMessage", "Go Back "+username);
		return modelAndView;
	}
	
	@RequestMapping("/welcomeWithountPathVariable/{city}/{username}")
	public ModelAndView welcomeWithountPathVariable(@PathVariable Map<String,String> pathVars) {
		ModelAndView modelAndView = new ModelAndView("HelloWorld");
		String username = pathVars.get("username");
		String city = pathVars.get("city");
		modelAndView.addObject("welcomeMessage", "Welcome without Path Variable "+username+" from "+city);
		return modelAndView;
	}
}
