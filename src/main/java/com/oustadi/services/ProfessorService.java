package com.oustadi.services;

import java.util.List;
import java.util.Optional;

import com.oustadi.entities.Professor;

public interface ProfessorService {
	public Professor save_Professor(Professor Professor);
	public List<Professor> getAllProfessors();
	public Professor updateProfessor(Professor Professor);
	public boolean deleteProfessor(Long id_Professor);
	public Optional<Professor> getProfessorById(Long Professor_id);
}
