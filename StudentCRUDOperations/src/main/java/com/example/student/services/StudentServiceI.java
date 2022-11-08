package com.example.student.services;

import java.util.List;

import com.example.student.entities.Student;

public interface StudentServiceI {

	// create student record
	public Student createStudent(Student student);
	
	// update student record
	public Student updateStudent(Student student, Integer sId);
	
	//delete student record
	public void deleteStudent(Integer sId);
	
	// Get All Students From database
	public List<Student> getAllStudent();
	
	
}
