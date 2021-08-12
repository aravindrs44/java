package com.aravind.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aravind.languages.models.Language;
import com.aravind.languages.services.LanguageService;

@Controller
public class LanguageController {
	
	private final LanguageService languageService;
	 
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	//index page contains create form!
	@RequestMapping("/languages")
	public String indexView(@ModelAttribute("language") Language language, Model model) {
		List<Language> langs = languageService.allLanguages();
		model.addAttribute("langs", langs);
		System.out.println("hello");
		System.out.println(langs);
		return "index.jsp";
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Language> langs = languageService.allLanguages();
			model.addAttribute(langs);
			return "/index.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String showView(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		 model.addAttribute(language);
		 return "/show.jsp";
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String editView(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute(language);
		return "/edit.jsp";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			return "/edit.jsp";
		} else {
			languageService.updateLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
