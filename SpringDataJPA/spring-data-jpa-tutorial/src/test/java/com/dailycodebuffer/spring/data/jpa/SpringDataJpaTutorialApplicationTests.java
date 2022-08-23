package com.dailycodebuffer.spring.data.jpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.Entity.Guardian;
import com.dailycodebuffer.spring.data.jpa.Entity.Student;
import com.dailycodebuffer.spring.data.jpa.Repository.StudentRepository;

@SpringBootTest
class SpringDataJpaTutorialApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void saveStudent() {
		Guardian guardian = new Guardian();
		guardian.setName("Shiva");
		guardian.setEmail("shiva@gmail.com");
		guardian.setMobile("9999999999");
		
		
		Student student = new Student();
		student.setFirstName("Rahul");
		student.setLastName("Kumar");
		student.setEmailId("rahul@gmail.com");
		student.setGuardian(guardian);
		
		studentRepository.save(student);
	}

	@Test
	public void findAllStudents()
	{
		List<Student> studentList =  studentRepository.findAll();
		System.out.println(studentList);
	}
	
	@Test
	public void printStudentByStudentId() {
		List<Student> student = studentRepository.findByStudentId(1L);
		System.out.println(student);
	}
	
}
