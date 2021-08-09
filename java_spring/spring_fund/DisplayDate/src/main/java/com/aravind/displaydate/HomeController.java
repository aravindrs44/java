package com.aravind.displaydate;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
    	return "index.jsp";
    }
    
    @RequestMapping("/date")
    public String date(Model model) {
    	Date date = new Date();
    	DateFormat dateformat = new SimpleDateFormat("EEEE', the' d ' of ' MMMM', 'y");
    	model.addAttribute("date", dateformat.format(date));
    	return "date.jsp";
    }
    
    @RequestMapping("/time")
    public String time(Model model) {
    	Date date = new Date();; 
    	DateFormat time = new SimpleDateFormat("h':'mm aa");
    	
    	model.addAttribute("time", time.format(date));
    	return "time.jsp";
    }
    
}

