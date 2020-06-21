package com.oustadi.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.oustadi.dao.Professordao;
import com.oustadi.entities.Professor;
import com.oustadi.services.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {
	@Autowired
	Professordao professordao;

	@Override
	public Professor save_Professor(Professor Professor) {
		// TODO Auto-generated method stub
		return professordao.save(Professor);
	}

	@Override
	public List<Professor> getAllProfessors() {
		// TODO Auto-generated method stub
		return professordao.findAll();
	}

	@Override
	public Professor updateProfessor(Professor Professor) {
		// TODO Auto-generated method stub
		return professordao.save(Professor);
	}

	@Override
	public boolean deleteProfessor(Long id_Professor) {
		if (professordao.findById(id_Professor) == null)
			return false;
		// TODO Auto-generated method stub
		professordao.deleteById(id_Professor);
		return true;
	}

	@Override
	public Optional<Professor> getProfessorById(Long Professor_id) {
		// TODO Auto-generated method stub
		return professordao.findById(Professor_id);
	}

	
	@Override
	public Page<Professor> FindPaginated(int pageNO, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNO - 1, pageSize);
		return professordao.findAll(pageable);
	}

}
