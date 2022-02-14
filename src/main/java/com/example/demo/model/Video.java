package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String link;
    @ManyToOne
    private Museum museum;
}
