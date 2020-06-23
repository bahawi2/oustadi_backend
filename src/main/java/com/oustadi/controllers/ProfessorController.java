package com.oustadi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oustadi.entities.Professor;
import com.oustadi.entities.dto.ProfessorDto;
import com.oustadi.services.ProfessorService;

@RestController
@RequestMapping("profesors")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("")
	public List<Professor> getAllProfessors() {
		return professorService.getAllProfessors();
	}
	
	@GetMapping("/{id}")
	public Professor getAllProfessor(@PathVariable("id") Long prof_id) {
		return professorService.getProfessorById(prof_id).get();
	}
	
	@GetMapping("/page/{pageNo}")
	public ProfessorDto getPageOfProfessor(@PathVariable("pageNo") int pageNo, Model model) {
		Page<Professor> page = professorService.FindPaginated(pageNo, 6);
		List<Professor> listProfessors = page.getContent();
		model.addAttribute("currentPage"  , pageNo);
		model.addAttribute("totalPage"  , page.getTotalPages());
		model.addAttribute("totalItems"  , page.getTotalElements());
		
		return new ProfessorDto(listProfessors, model);
	}

}
