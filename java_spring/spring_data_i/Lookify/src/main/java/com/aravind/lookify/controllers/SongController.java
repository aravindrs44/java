package com.aravind.lookify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {
	@RequestMapping("/")
	public String indexView() {
		return "/lookify/index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboardView() {
		return "lookify/dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String createView() {
		return "lookify/new.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String readOneView(@PathVariable("id") Long id) {
		return "lookify/show.jsp";
	}
	
	@RequestMapping("/search/topTen")
	public String readTopTen() {
		return "lookify/topTenSongs.jsp";
	}
	
	@RequestMapping("/search/{search}") 
	public String readSearch(@PathVariable("search") String search) {
		return "lookify/search.jsp";
	}
}
