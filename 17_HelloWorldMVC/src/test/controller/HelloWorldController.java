package test.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.business.MessageGenerator;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

	@Autowired
	MessageGenerator generator;
	
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(ModelMap model, Locale locale) {
		System.out.println(locale.getDisplayName());
		model.addAttribute("message", generator.getMessage());
		return "helloWorldView";
	}
	
}
