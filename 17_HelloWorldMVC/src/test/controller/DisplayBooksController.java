package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.dao.BookDAO;

@Controller
@RequestMapping("/displayBooks")
public class DisplayBooksController {

	@Autowired
	BookDAO dao;

	@RequestMapping(
			//value="/all",
			method=RequestMethod.GET)
	public String displayAllBooks(ModelMap map) {
		map.addAttribute("books",dao.readAll());
		return "displayBooksView";
	}
	
}
