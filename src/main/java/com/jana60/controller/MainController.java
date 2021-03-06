package com.jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jana60.model.Departments;
import com.jana60.repository.DepartmentsRepository;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private DepartmentsRepository repo;
	
	@GetMapping("/")
	public String countBonus (Model m) {
		List<Departments> depa = (List<Departments>) repo.findAll();
		List<String> dep = List.of();
		m.addAttribute("depName",depa);
		return "Index";
	}
	
	@GetMapping("/vecchio")
	public String countries(Model model) {
		List<String> dep = List.of("Ingegneria","Architettura","Economia");
		model.addAttribute("depar", dep);
		return "vecchio";
	}

	@GetMapping("/depid_{id}")  // NON SI FA COSI'
	public String depDetail(Model mod , 
		@PathVariable(name="id") Integer depaKey){
		Departments thisDepa = repo.findById(depaKey).get();
		mod.addAttribute("deta",thisDepa);
		return "departmentDet";
	}
}
