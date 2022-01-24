package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data

public class Nation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private City city;

}
