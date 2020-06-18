package com.oustadi.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class User_App implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String full_name;
	private LocalDate birth_day;
	private String username;
	private String password;
	public User_App(String full_name, LocalDate birth_day, String username, String password) {
		super();
		this.full_name = full_name;
		this.birth_day = birth_day;
		this.username = username;
		this.password = password;
	}
	
	

}
