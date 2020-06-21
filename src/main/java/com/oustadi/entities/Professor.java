package com.oustadi.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Professor extends User_App implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double hour_price;
	
	
	public Professor(String full_name, LocalDate birth_day, String username, String password,String email) {
		super(full_name, birth_day, username, password,email);
	}
	
	
	
	

}
