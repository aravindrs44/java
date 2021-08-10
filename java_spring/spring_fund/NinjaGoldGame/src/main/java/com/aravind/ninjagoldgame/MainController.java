package com.aravind.ninjagoldgame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	ArrayList<String> activities = new ArrayList<String>();
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("gold", 0);
		session.setAttribute("activityLog", activities);
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/gold")
	public String gold(Model model, HttpSession session) {
		model.addAttribute("gold", session.getAttribute("gold"));
		return "Gold.jsp";
	}
	
	@RequestMapping(value="/logic", method=RequestMethod.POST)
	public String logic(HttpSession session, Model model,
			@RequestParam(value="type", required=false) String type) {
		if(type.equals("farm")) {
			double mined = Math.floor(Math.random()*10)+10;
			session.setAttribute("gold", (Integer)session.getAttribute("gold")+(int)mined);
			activities.add("You entered a farm and earned " + (int)mined + " gold. " + this.getDate());
			session.setAttribute("activityLog", activities);
		} else if(type.equals("cave")) {
			double mined = Math.floor(Math.random()*5)+5;
			session.setAttribute("gold", (Integer)session.getAttribute("gold")+(int)mined);
			activities.add("You entered a cave and earned " + (int)mined + " gold. " + this.getDate());
			session.setAttribute("activityLog", activities);
		} else if(type.equals("house")) {
			double mined = Math.floor(Math.random()*3)+2;
			session.setAttribute("gold", (Integer)session.getAttribute("gold")+(int)mined);
			activities.add("You entered a house and earned " + (int)mined + " gold. " + this.getDate());
			session.setAttribute("activityLog", activities);
		} else if(type.equals("casino")) {
			double temp = Math.floor(Math.random()*100)-50;
			int mined = (int)temp;
			session.setAttribute("gold", (Integer)session.getAttribute("gold")+mined);
			if(mined > 0) {				
				activities.add("You entered a casino and earned " + mined + " gold. " + this.getDate());
			} else if(mined < 0) {
				activities.add("You entered a casino and lost " + mined + " gold. Ouch! " + this.getDate());				
			} else {
				activities.add("You entered a casino and lost no gold. Lucky you! " + this.getDate());
			}
			session.setAttribute("activityLog", activities);
		}
		return "redirect:/gold";
	}
	
	private String getDate() {
		Date date = new Date();
    	DateFormat dateformat = new SimpleDateFormat("MMMM d y h':'mm aa");
    	String time = dateformat.format(date);
    	return time;
    }
}
