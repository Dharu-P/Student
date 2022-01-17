package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.StudentCRUD;
import com.example.crud.service.StudentCRUDService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    StudentCRUDService stuServ;
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public void createStudent(@RequestBody StudentCRUD stud) {
	    stuServ.createStudent(stud);
	}

    @RequestMapping(value="/students", method=RequestMethod.GET)
    public List<StudentCRUD> getStudents(){
        return stuServ.getStudent();
    }

	@RequestMapping(value="/student/{id}", method=RequestMethod.PUT)
	public StudentCRUD readStudent(@PathVariable(value = "id") Integer id, @RequestBody StudentCRUD studentDetails) {
	    return stuServ.updateStudent(id, studentDetails);
	}

	@RequestMapping(value="/student/{id}", method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable(value = "id") Integer id) {
	    stuServ.deleteStudent(id);
	}
   
}
