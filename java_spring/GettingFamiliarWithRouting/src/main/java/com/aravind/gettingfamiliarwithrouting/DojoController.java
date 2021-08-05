package com.aravind.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String awesome(@PathVariable("location") String location) {
		String output;
		if(location.equals("dojo")) {
			output = "The dojo is awesome!";
		} else if(location.equals("burbank-dojo")) {
			output = "Burbank Dojo is located in Southern California.";
		} else if(location.equals("san-jose")) {
			output = "SJ dojo is the headquarters.";
		} else {			
			output = location + " is awesome!";
		}
		System.out.println(location);
		return output;
	}
}
