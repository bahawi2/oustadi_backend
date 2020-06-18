package com.oustadi.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oustadi.entities.Student;

@Repository
public interface Studentdao extends  JpaRepository<Student, Long>   {

}
