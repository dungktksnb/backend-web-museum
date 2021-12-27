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
    public City() {
    }
    public City(Long id, String name, Museum museum) {
        this.id = id;
        this.name = name;
        this.museum = museum;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Museum getMuseum() {
        return museum;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }
}
