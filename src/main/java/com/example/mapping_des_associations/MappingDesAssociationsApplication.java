package com.example.mapping_des_associations;

import com.example.mapping_des_associations.dao.entities.Student;


import com.example.mapping_des_associations.dao.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.mapping_des_associations.dao.repositories.CourseRepository;
import com.example.mapping_des_associations.dao.repositories.SessionRepository;
import com.example.mapping_des_associations.dao.repositories.StudentRepository;
import com.example.mapping_des_associations.dao.repositories.TeacherRepository;
import java.util.Date;

@SpringBootApplication
public class MappingDesAssociationsApplication {
    @Autowired
    private StudentRepository studentRepository;
    private TeacherRepository teacherRepository;
    private SessionRepository seanceRepository;
    private CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(MappingDesAssociationsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository,TeacherRepository teacherRepository,SessionRepository sessionRepository,CourseRepository courseRepository) {
        return args -> {
            Student student = new Student();
            student.setName("Imane");
            student.setName("2003");
            studentRepository.save(student);
            Teacher teacher = new Teacher();
            teacher.setName("cccc");

            teacherRepository.save(teacher);
            teacherRepository.findById(teacher.getId());


        };

    }}