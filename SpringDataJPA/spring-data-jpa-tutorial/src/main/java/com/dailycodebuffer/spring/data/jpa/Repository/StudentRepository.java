package com.dailycodebuffer.spring.data.jpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.spring.data.jpa.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByStudentId(Long studentId);

}
