package com.example.mapping_des_associations.dao.repositories;
import com.example.mapping_des_associations.dao.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
