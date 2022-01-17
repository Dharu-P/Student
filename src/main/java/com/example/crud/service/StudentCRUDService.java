package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.StudentCRUD;
import com.example.crud.repository.StudentCRUDRepo;

@Service
public class StudentCRUDService {
	@Autowired
	StudentCRUDRepo sturepo;
	
	//Create
	public StudentCRUD createStudent(StudentCRUD stud) {
		return sturepo.save(stud);
	}
	
	//Read
	public List<StudentCRUD> getStudent(){
		return sturepo.findAll();
	}
	
	//Delete
	public void deleteStudent(Integer id) {
		sturepo.deleteById(id);
	}
	
	//Update
	public StudentCRUD updateStudent(Integer id, StudentCRUD studet) {
		StudentCRUD stud=sturepo.findById(id).get();
		stud.setFirstname(studet.getFirstname());
		stud.setLastname(studet.getLastname());
		stud.setDob(studet.getDob());
		
		return sturepo.save(stud);
	}
}
