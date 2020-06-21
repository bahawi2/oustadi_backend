package com.oustadi.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties(value = "student_level")
public class Student extends User_App implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "level_id")
	private Level student_level;

	public Student(String full_name, LocalDate birthday, String username, String password,String email , Level student_level) {
		super(full_name, birthday, username, password,email);
		this.student_level = student_level;
	}
	
	
	
	
}
