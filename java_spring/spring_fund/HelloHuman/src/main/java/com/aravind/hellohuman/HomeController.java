package com.aravind.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "fname", required = false) String fname, @RequestParam(value = "lname", required = false) String lname) {
        String output;
        if(fname == null && lname == null) {
        	output = "<h1>Hello Human</h1>" + "<br>Welcome to Springboot!";
        } else if(lname == null) {
        	output = "Hello " + fname + "<br>Welcome to Springboot!";
        } else {
        	output = "Hello {fname}" + fname + " " + lname + "Welcome to Springboot!";
        }
        
        return output;
    }
}
