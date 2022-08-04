package com.orleave.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REPORT")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "no", nullable = false, columnDefinition = "INT UNSIGNED")
	private int no;
	
	@ManyToOne()
    @JoinColumn(name = "user_no")
	private User user;
	
	@Column(name = "reported_no")
	private int reported_no;
	
	@Column(name="category")
	private int category; 
	
	@Column(name="context")
	private int context; 
	

}