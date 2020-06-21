package com.oustadi.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Classeroom implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classeroom_id;
	private LocalDateTime start_time;
	private LocalDateTime end_time;
	private boolean started;
	private boolean finished;
	private float rate;
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "student_id")
	private Student student = new Student();
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "professort_id")
	private Professor professor = new Professor();
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "subject_id")
	private Subject subject = new Subject();

	
	
	
}
