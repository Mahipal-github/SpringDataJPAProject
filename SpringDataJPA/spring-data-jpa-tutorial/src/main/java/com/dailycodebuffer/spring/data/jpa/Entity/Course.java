package com.dailycodebuffer.spring.data.jpa.Entity;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {
	
	@Id
	@SequenceGenerator(name="course_sequence",
	sequenceName = "course_sequence",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_sequence")
	private Long courseId;
	private String titile;
	private String credits;
	
	public Course() {
		
	}

	public Course(Long courseId, String titile, String credits) {
		super();
		this.courseId = courseId;
		this.titile = titile;
		this.credits = credits;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
	
	@OneToOne(mappedBy = "course")
private CourseMaterial courseMaterial;	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_Id",
	referencedColumnName = "teacherId")
	private Teacher teacher;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="course_student_map",
	joinColumns = @JoinColumn(name="course_id",referencedColumnName = "courseId"),
	inverseJoinColumns = @JoinColumn(name="student_id",referencedColumnName = "studentId"))
	private List<Student> student;

}
