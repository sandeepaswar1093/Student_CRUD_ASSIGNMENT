package com.example.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entities.Student;
import com.example.student.exceptions.ResourceNotFoundException;
import com.example.student.repositories.StudentRepo;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student createStudent(Student student) {

		Student studentCreated = studentRepo.save(student);
		return studentCreated;
	}

	@Override
	public Student updateStudent(Student student, Integer sId) {

		Student stu = studentRepo.findById(sId)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "Student Id", sId));
		stu.setSname(student.getSname());
		stu.setSphone(student.getSphone());
		stu.setSemail(student.getSemail());
		stu.setSaddress(student.getSaddress());
		Student updatedStudent = studentRepo.save(stu);
		return updatedStudent;
	}

	@Override
	public void deleteStudent(Integer sId) {

		Student student = studentRepo.findById(sId)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "Student Id", sId));
		studentRepo.delete(student);
	}

	@Override
	public List<Student> getAllStudent() {

		List<Student> allStudents = studentRepo.findAll();
		return allStudents;
	}

}
