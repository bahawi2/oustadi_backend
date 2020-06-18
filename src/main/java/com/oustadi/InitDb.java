package com.oustadi;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oustadi.entities.Level;
import com.oustadi.entities.Student;
import com.oustadi.services.StudentService;

//@Component
public class InitDb implements CommandLineRunner{
	@Autowired
	StudentService syudent_service;
	
	LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1); 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		syudent_service.save_studen(new Student("AIT BAHA ISMAIL", birthday, "bahaoui", "bahaoui1234", new Level("3 eme")));
		
	}

}
