package com.dailycodebuffer.spring.data.jpa.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Teacher {

	@Id
	@SequenceGenerator(name="Teacher_sequence",
	sequenceName = "Teacher_sequence",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Teacher_sequence")
	private Long teacherId;
	private String firstName;
	private String lastName;
	
	private Teacher()
	{
		
	}

	public Teacher(Long teacherId, String firstName, String lastName) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_id",
	referencedColumnName = "teacherId")
	private List<Course> course;
	*/
}
