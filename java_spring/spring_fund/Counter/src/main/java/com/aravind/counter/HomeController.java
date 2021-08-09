package com.aravind.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			Integer temp = (Integer)session.getAttribute("count");
			temp++;
			session.setAttribute("count", temp);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		model.addAttribute("count", (Integer)session.getAttribute("count"));
		return "Counter.jsp";
	}
}
