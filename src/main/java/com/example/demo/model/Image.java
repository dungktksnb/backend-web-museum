package com.example.demo.model;




import javax.persistence.*;

@Entity

public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String linkImg;
    @ManyToOne
    private Museum museum;

    public Image() {
    }

    public Image(Long id, String name, String linkImg, Museum museum) {
        this.id = id;
        this.name = name;
        this.linkImg = linkImg;
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

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public Museum getMuseum() {
        return museum;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }
}
