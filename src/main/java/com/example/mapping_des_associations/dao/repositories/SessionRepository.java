package com.example.mapping_des_associations.dao.repositories;
import com.example.mapping_des_associations.dao.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Integer> {
}