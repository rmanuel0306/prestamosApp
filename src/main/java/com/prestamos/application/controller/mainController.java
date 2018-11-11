package com.prestamos.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class mainController {
	
	@RequestMapping("/principal")
	public String testpage() {
		return "main-principal";
	}
}
