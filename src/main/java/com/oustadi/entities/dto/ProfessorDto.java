package com.oustadi.entities.dto;

import java.util.List;

import org.springframework.ui.Model;

import com.oustadi.entities.Professor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorDto {
	private List<Professor> listOfProfessors;
	private Model model;

}
