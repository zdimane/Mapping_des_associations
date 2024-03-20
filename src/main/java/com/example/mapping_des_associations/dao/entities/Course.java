package com.example.mapping_des_associations.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int Id;
    @Column(name = "titre")
    private String title;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "course")
    private Collection<Session> sessions;

    @OneToOne
    private Teacher teacher;
}
