package com.example.mapping_des_associations.dao.repositories;

import com.example.mapping_des_associations.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
