package com.example.student.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentid")
	private Integer sid;
	
	@Column(name = "studentName")
	private String sname;
	
	@Column(name = "studentPhone")
	private String sphone;
	
	@Column(name = "studentEmail")
	private String semail;
	
	@Column(name = "studentAddress")
	private String saddress;
	
}


