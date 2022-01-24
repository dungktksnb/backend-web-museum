package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private  Museum museum;
}
