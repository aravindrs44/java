package com.aravind.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravind.dojosandninjas.models.Dojo;
import com.aravind.dojosandninjas.models.Ninja;
import com.aravind.dojosandninjas.services.DojoService;
import com.aravind.dojosandninjas.services.NinjaService;

@Controller
public class MainController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public MainController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/dojos/new")
	public String newDojoView(@ModelAttribute("dojo") Dojo dojo) {
		return "/newDojo.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/dojos/new";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@RequestMapping("/ninjas/new") 
	public String newNinjaView(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoService.readAllDojos());
		return "/newNinja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDojos", dojoService.readAllDojos());
			return "/newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId();
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String readNinjasById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.readOneDojo(id));
		model.addAttribute("ninjas", ninjaService.readAllNinjasOfDojo(id));
		return "/showDojoView.jsp";
	}
}
