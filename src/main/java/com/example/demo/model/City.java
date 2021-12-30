package com.example.demo.model;
import javax.persistence.*;
@Entity

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private  Museum museum;
    public City() {
    }

    public City(Long id, String name, Museum museum) {
        this.id = id;
        this.name = name;
        this.museum = museum;
    }

}
