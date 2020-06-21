package com.oustadi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oustadi.entities.Professor;

@Repository
public interface Professordao extends JpaRepository<Professor, Long>{

}
