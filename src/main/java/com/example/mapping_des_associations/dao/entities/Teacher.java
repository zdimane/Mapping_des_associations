package com.example.mapping_des_associations.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Personne{


    @Column(name="d_affectation")
    private Date d_affectation;

    @OneToOne(mappedBy="teacher")
    private Course course;
}
