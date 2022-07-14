package com.jana60.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String countries(Model model) {
		List<String> dep = List.of("Ingegneria","Architettura","Economia");
		model.addAttribute("depar", dep);
		return "index";
	}

}
