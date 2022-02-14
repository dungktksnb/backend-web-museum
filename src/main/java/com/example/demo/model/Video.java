package com.example.demo.model;

;

import javax.persistence.*;

@Entity

public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String link;
    @ManyToOne
    private Museum museum;

    public Video() {
    }

    public Video(Long id, String name, String link, Museum museum) {
        this.id = id;
        this.name = name;
        this.link = link;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Museum getMuseum() {
        return museum;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }
}
