package com.example.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.StudentCRUD;
@Repository
public interface StudentCRUDRepo extends JpaRepository<StudentCRUD,Integer>{

}
