package com.oustadi.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Availability implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long availability_id;

	private LocalDateTime start_date;
	private LocalDateTime end_date;
	private boolean disponible;
	private boolean reserved;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "professor_Availability", joinColumns = {
			@JoinColumn(name = "Availability_id") }, inverseJoinColumns = { @JoinColumn(name = "profesor_id") })
	private List<Professor> professors;

}
