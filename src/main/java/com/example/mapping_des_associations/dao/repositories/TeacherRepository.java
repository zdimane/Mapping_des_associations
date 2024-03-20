package com.example.mapping_des_associations.dao.repositories;
import com.example.mapping_des_associations.dao.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}