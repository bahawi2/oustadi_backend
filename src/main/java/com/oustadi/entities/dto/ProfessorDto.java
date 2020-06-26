package com.oustadi.entities.dto;

import java.util.List;

import org.springframework.ui.Model;

import com.oustadi.entities.Professor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProfessorDto {
	public ProfessorDto(List<Professor> listProfessors, Model model2) {
		// TODO Auto-generated constructor stub
	}
	private List<Professor> listOfProfessors;
	private Model model;

}
