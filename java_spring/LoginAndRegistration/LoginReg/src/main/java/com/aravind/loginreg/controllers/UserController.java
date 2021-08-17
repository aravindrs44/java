package com.aravind.loginreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aravind.loginreg.models.User;
import com.aravind.loginreg.services.UserService;

@Controller
public class UserController {
	private final UserService userService;
 
	public UserController(UserService userService) {
		this.userService = userService;
	}
 
	 @RequestMapping("/registration")
	 public String registerForm(@ModelAttribute("user") User user) {
	     return "registrationPage.jsp";
	 }
	 	@RequestMapping("/login")
	 public String login() {
	     return "loginPage.jsp";
	 }
	 
	 @RequestMapping(value="/registration", method=RequestMethod.POST)
	 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		 //if result has errors, return the registration page (don't worry about validations just now)
	     // else, save the user in the database, save the user id in session, and redirect them to the /home route
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		} else {
			userService.registerUser(user);
			session.setAttribute("userID", user.getId());
			return "redirect:/registration";
		}
	 }
	 
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, RedirectAttributes flash, HttpSession session) {
	     // if the user is authenticated, save their user id in session
	     // else, add error messages and return the login page
		 if(userService.authenticateUser(email, password)) {
			 session.setAttribute("userID", userService.findByEmail(email).getId());
			 return "redirect:/home";
		 } else {
			 flash.addFlashAttribute("error", "The credentials you entered appear to be incorrect");
			 return "loginPage.jsp";
		 }
	 }
	 
	 @RequestMapping("/home")
	 public String home(HttpSession session, Model model) {
	     // get user from session, save them in the model and return the home page
		 if(session.getAttribute("userID") == null) {			 
			 return "redirect:/login";
		 } else {
			 model.addAttribute("user", userService.findUserById((Long)session.getAttribute("userID")));
			 return "homePage.jsp";
		 }
	 }
	 
	 @RequestMapping("/logout")
	 public String logout(HttpSession session) {
	     // invalidate session
	     // redirect to login page
		 session.invalidate();
		 return "redirect:/login";
	 }
}

