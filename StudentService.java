package com.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.entity.Student;
import com.crud.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository ;
	
	//FOR POST
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students) {
		return repository.saveAll(students);
	}
	
	//FOR GET
	public List<Student>getStudents(){
		return repository.findAll();
	}
	
	public Student getStudentById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Student getStudentByFname(String fname){
		return repository.findByFname(fname);
	}
	
	//FOR DELETE
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "student is removed " + id;
	}
	
	
}
