package test.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.dao.Book;
import test.dao.BookDAO;
import test.mvc.CreateBookFormBean;

@Controller
@RequestMapping("/createBook")
public class CreateBookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(ModelMap model) {
		CreateBookFormBean form = new CreateBookFormBean();
		Book myBook = new Book();
		myBook.setAuthor("");
		form.setCoverType("Paperback");
		form.setBook(myBook);
		
		model.addAttribute("createBookFormBean", form);
		return "createBookForm";
	}
	
	@ModelAttribute("authorNames")
	public List<String> populateAuthorNames() {
		return dao.readAllAuthors();
	}
	
	@ModelAttribute("coverTypes")
	public List<String> populateCoverTypes() {
		return Arrays.asList(new String[] {
				"Hardcover","Paperback","Hard paperback"
		});
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String createBook(
			ModelMap model,
			@ModelAttribute CreateBookFormBean formBean
			//,HttpServletRequest request
			) {
		dao.create(formBean.getBook());
		model.addAttribute("book", formBean.getBook());

		String url = "/mvc/displayBooks";
		System.out.println(url);
		return "redirect:" + url;
		
	}
	
	
	
	
	
	
}
