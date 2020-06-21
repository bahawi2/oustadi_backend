package com.oustadi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Comment implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comment_id;
	private String comment_text;
	
	private Date comment_date;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="User_id", nullable=false)
	private User_App user;

	public Comment(String full_name) {
		super();
		this.comment_text = full_name;
		this.comment_date = new Date();
	}

}
