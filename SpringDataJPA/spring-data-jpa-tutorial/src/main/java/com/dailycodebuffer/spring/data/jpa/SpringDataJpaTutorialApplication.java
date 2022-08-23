package com.dailycodebuffer.spring.data.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dailycodebuffer.spring.data.jpa.Entity.Student;
import com.dailycodebuffer.spring.data.jpa.Repository.StudentRepository;


@SpringBootApplication
public class SpringDataJpaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaTutorialApplication.class, args);
	
	}
	@Autowired
	private StudentRepository studentRepository;
	
	public void printAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		System.out.println(studentList);
	}
}
