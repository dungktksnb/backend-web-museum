package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "name_language")
    private String name;
}
