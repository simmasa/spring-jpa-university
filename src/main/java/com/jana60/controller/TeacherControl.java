package com.jana60.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import com.jana60.repository.TeacherRepository;
import com.jana60.model.Teachers;

@Controller
@RequestMapping("/teachers")
public class TeacherControl {
	
	@Autowired
	public TeacherRepository teacherepo;

	@GetMapping
	public String teachers(Model model) {
		model.addAttribute("teach",teacherepo.findAll());
		return "teachers";
	}
	
	@GetMapping("/detail/{id}")
	public String teachDet(Model m,
			@PathVariable(name="id") Integer teacherId) {
		Optional<Teachers> teachers = teacherepo.findById(teacherId);
		if (teachers.isPresent()) {
		m.addAttribute("teach", teachers.get());
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Professore non trovato");
		}
		return "teacherdet";
	}
	
}
