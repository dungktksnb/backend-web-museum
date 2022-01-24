package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data

public class Museum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    @ManyToOne
    private Product product;
    @ManyToOne
    private  Video video;
    @ManyToOne
    private Image image;

}
