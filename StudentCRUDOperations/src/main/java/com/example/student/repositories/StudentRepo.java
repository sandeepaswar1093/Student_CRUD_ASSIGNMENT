package com.example.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	

}
