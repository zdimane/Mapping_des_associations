package com.example.mapping_des_associations.dao.entities;

import com.example.mapping_des_associations.dao.repositories.StudentRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Personne {

    @Column(name="matricule")
    private String matricule;

    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private Collection<Session> sessions = new ArrayList<>();
}
