package com.example.mapping_des_associations.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(unique = true)
    private int Id;
    @Column(name = "date")
    private Date date;
    @Column(name = "h_debut")
    private Date h_start;
    @Column(name = "h_fin")
    private Date h_finish;

    @ManyToOne
    private Course course;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students = new ArrayList<>();

}
