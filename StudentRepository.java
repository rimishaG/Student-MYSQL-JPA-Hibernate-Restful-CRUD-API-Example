package com.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.example.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

	Student findByFname(String fname);
	

}
