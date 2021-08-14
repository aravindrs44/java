package com.aravind.relationships.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aravind.relationships.models.License;
import com.aravind.relationships.models.Person;
import com.aravind.relationships.services.LicenseService;
import com.aravind.relationships.services.PersonService;

@Controller
public class RelationshipController {
	private final LicenseService licenseService;
	private final PersonService personService;
	
	public RelationshipController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "/newPerson.jsp";
	}
	
	@RequestMapping(value="/persons/create", method=RequestMethod.POST)
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/newPerson.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:/persons/new";
		}
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> allPersons = personService.readAllPersons();
		model.addAttribute(allPersons);
		return "/NewLicense.jsp";
	}
	
	@RequestMapping(value="/licenses/create", method=RequestMethod.POST)
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Person> allPersons = personService.readAllPersons();
			model.addAttribute(allPersons);
			return "/NewLicense.jsp";
		} else {
			licenseService.createLicense(license);
			return "redirect:/licenses/new";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String readOnePerson(@PathVariable("id") Long id, Model model) {
		Person person = personService.readOnePerson(id);
		model.addAttribute(person);
		return "/readPerson.jsp";
	}
	
	
}
