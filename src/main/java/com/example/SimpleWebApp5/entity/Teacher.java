package com.example.SimpleWebApp5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_teacher",nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name ="surname",nullable = false)
    private String surname;

    @ManyToOne
    @JoinColumn(name="id_department")
    private Department department;

}
