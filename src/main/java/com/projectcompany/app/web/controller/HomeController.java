package com.projectcompany.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// abrindo pagina home
	@GetMapping("/home")
	public String home() {
		return "home";
	}	
}
