package com.oustadi.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oustadi.dao.Studentdao;
import com.oustadi.entities.Student;
import com.oustadi.services.StudentService;

@Service
public class StudentServiceImmp implements StudentService {

	@Autowired
	Studentdao studentdao;

	@Override
	public Student save_studen(Student student) {
		// TODO Auto-generated method stub
		return studentdao.save(student);
	}

	@Override
	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		return studentdao.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Long student_id) {
		// TODO Auto-generated method stub
		return studentdao.findById(student_id);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentdao.saveAndFlush(student);
	}

	@Override
	public boolean deleteStudent(Long id_student) {
		// TODO Auto-generated method stub
		if (getStudentById(id_student).get() == null)
			return false;
		studentdao.deleteById(id_student);
		return true;
	}

}
