package com.aravind.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		if(code.toLowerCase().equals("bushido")) {
			return "redirect:/code";
		} else {
			redirectAttributes.addFlashAttribute("error", "Code is wrong!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	public String code() {
		return "Code.jsp";
	}
}
