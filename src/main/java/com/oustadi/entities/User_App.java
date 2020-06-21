package com.oustadi.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="user_type")
@Inheritance(strategy = InheritanceType.JOINED)
//@MappedSuperclass
public class User_App implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	@Column
	private String full_name;
	@Column
	private LocalDate birth_day;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	private String sexe;
	private String photo;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,mappedBy = "user")
	private List<Comment> comments = new ArrayList<Comment>();

	public User_App(String full_name, LocalDate birth_day, String username, String password, String email) {
		super();
		this.full_name = full_name;
		this.birth_day = birth_day;
		this.username = username;
		this.password = password;
		this.email = email;
	}

}
