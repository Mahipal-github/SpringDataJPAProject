package com.dailycodebuffer.spring.data.jpa.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
//@ToString(exclude="Course") //when using lazy fetch type it will look for toString() method which has course object 
public class CourseMaterial {

	@Id
	@SequenceGenerator(name="courseMaterial_sequence",
	sequenceName = "courseMaterial_sequence",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "courseMaterial_sequence")
	private Long courseMaterialId;
	private String url;
	
	public CourseMaterial() {
		
	}

	public CourseMaterial(Long courseMaterialId, String url) {
		super();
		this.courseMaterialId = courseMaterialId;
		this.url = url;
	}

	public Long getCourseMaterialId() {
		return courseMaterialId;
	}

	public void setCourseMaterialId(Long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional = false)
	@JoinColumn(name="course_Id",
	referencedColumnName = "courseId")
	private Course course; 
	
}
