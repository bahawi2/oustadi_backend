package com.oustadi;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oustadi.entities.Level;
import com.oustadi.entities.Professor;
import com.oustadi.entities.Student;
import com.oustadi.services.ProfessorService;
import com.oustadi.services.StudentService;

@Component
public class InitDb implements CommandLineRunner {
	@Autowired
	StudentService student_service;
	@Autowired
	ProfessorService professorService;

	LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		student_service.save_studen(new Student("AIT BAHA ISMAIL", birthday, "bahaoui", "bahaoui1234",
				"email@email.com", new Level("3 eme")));
		student_service.save_studen(
				new Student("TAHIRI NAJAT", birthday, "bahaoui", "bahaoui1234", "email@email.com", new Level("2 eme")));
		student_service.save_studen(new Student("ESSAKI SAIDA ", birthday, "bahaoui", "bahaoui1234", "email@email.com",
				new Level("4 eme")));
		student_service.save_studen(
				new Student("TIHANI OMAR", birthday, "bahaoui", "bahaoui1234", "email@email.com", new Level("1 eme")));
		student_service.save_studen(new Student("ERRAKI NAJATL", birthday, "bahaoui", "bahaoui1234", "email@email.com",
				new Level("5 eme")));

		professorService.save_Professor(new Professor("SAIDI NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(
				new Professor("TANJAWI KELTOUM NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService
				.save_Professor(new Professor("ROUHANI YASSINEL", birthday, "prof", "prof1234", "email@email.com"));

		professorService
				.save_Professor(new Professor("TIJANI MOURAD", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(new Professor("SAIDI NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(
				new Professor("TANJAWI KELTOUM NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService
				.save_Professor(new Professor("ROUHANI YASSINEL", birthday, "prof", "prof1234", "email@email.com"));

		professorService
				.save_Professor(new Professor("TIJANI MOURAD", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(new Professor("SAIDI NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(
				new Professor("TANJAWI KELTOUM NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService
				.save_Professor(new Professor("ROUHANI YASSINEL", birthday, "prof", "prof1234", "email@email.com"));

		professorService
				.save_Professor(new Professor("TIJANI MOURAD", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(new Professor("SAIDI NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService.save_Professor(
				new Professor("TANJAWI KELTOUM NAWAL", birthday, "prof", "prof1234", "email@email.com"));
		professorService
				.save_Professor(new Professor("ROUHANI YASSINEL", birthday, "prof", "prof1234", "email@email.com"));

		professorService
				.save_Professor(new Professor("TIJANI MOURAD", birthday, "prof", "prof1234", "email@email.com"));
	}

}
