package com.example.demo.model;
import javax.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private  String name;
    private String substance;
    private String dating;
    private String location;
    private  String img;
    private String experience3d;
    private String content ;
    @ManyToOne
    private  ProductLanguage productLanguage;

    public Product() {
    }

    public Product(Long id, String name, String substance, String dating, String location, String img, String experience3d, String content, ProductLanguage productLanguage) {
        Id = id;
        this.name = name;
        this.substance = substance;
        this.dating = dating;
        this.location = location;
        this.img = img;
        this.experience3d = experience3d;
        this.content = content;
        this.productLanguage = productLanguage;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public String getDating() {
        return dating;
    }

    public void setDating(String dating) {
        this.dating = dating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ProductLanguage getProductLanguage() {
        return productLanguage;
    }

    public void setProductLanguage(ProductLanguage productLanguage) {
        this.productLanguage = productLanguage;
    }
}
