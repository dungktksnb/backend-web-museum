package com.example.demo.model;

import javax.persistence.*;


@Entity

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
    public Museum() {
    }

    public Museum(Long id, String name, Product product, Video video, Image image) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.video = video;
        this.image = image;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
