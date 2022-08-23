package com.dailycodebuffer.spring.data.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.spring.data.jpa.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
