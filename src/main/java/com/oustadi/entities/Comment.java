package com.oustadi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private float rate;
	private Date comment_date;

	public Comment(String full_name, float rate) {
		super();
		this.comment_text = full_name;
		this.rate = rate;
		this.comment_date = new Date();
	}

}
