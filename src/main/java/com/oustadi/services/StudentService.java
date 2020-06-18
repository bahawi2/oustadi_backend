package com.oustadi.services;

import java.util.List;
import java.util.Optional;

import com.oustadi.entities.Student;

public interface StudentService {
	public Student save_studen(Student student);
	public List<Student> getAllstudents();
	public Student updateStudent(Student student);
	public boolean deleteStudent(Long id_student);
	public Optional<Student> getStudentById(Long student_id);

}
