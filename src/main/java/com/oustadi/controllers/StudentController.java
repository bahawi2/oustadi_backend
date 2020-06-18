package com.oustadi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oustadi.entities.Student;
import com.oustadi.services.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllstudents();
	}
	@GetMapping ("/student/{id}")
	public Optional<Student> getstudentBYID(@PathVariable("id") Long student_id) {
		return studentService.getStudentById(student_id);
	}

}
