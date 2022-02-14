package com.example.demo.model;

import javax.persistence.*;
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String img;//ảnh sản phẩm
    private String experience3d;//trải nghiệm 3d
    @ManyToOne
    private Museum museum;

    public Product() {
    }

    public Product(Long id, String img, String experience3d, Museum museum) {
        Id = id;
        this.img = img;
        this.experience3d = experience3d;
        this.museum = museum;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getExperience3d() {
        return experience3d;
    }

    public void setExperience3d(String experience3d) {
        this.experience3d = experience3d;
    }

    public Museum getMuseum() {
        return museum;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }
}
