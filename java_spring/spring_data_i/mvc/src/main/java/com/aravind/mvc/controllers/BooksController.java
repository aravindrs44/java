package com.aravind.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aravind.mvc.models.Book;
import com.aravind.mvc.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
 
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}
 
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/books/new.jsp";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/{id}")
	public String getOne(@PathVariable("id") long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute(book);
		return "/books/show.jsp";
	}
	
	@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE) 
	public String delete(@PathVariable("id") Long id){
		bookService.deleteBook(id);
		return "redirect:/books";
	}
	
	@RequestMapping("books/{id}/edit")
	 public String editBookForm(@PathVariable("id") Long id, Model model) {
		 Book book = bookService.findBook(id);
		 model.addAttribute(book);
		 return "redirect:/books/" + id;
	}
}

