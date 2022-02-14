package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//không cần i18n vẫn xử lý được đoạn ngôn ngữ.

@Entity

public class ProductLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;//id
    private String name;//tên
    private String content ;// nội dung
    private String dating;//niên đại
    private String substance;//chất liệu
    private String location;//địa điểm phát hiện
    private  String sound;//âm thanh
    @ManyToOne
    private Product product;
    @ManyToOne
    private  Language language;

    public ProductLanguage() {
    }

    public ProductLanguage(Long id, String name, String content, String dating, String substance, String location, String sound, Product product, Language language) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.dating = dating;
        this.substance = substance;
        this.location = location;
        this.sound = sound;
        this.product = product;
        this.language = language;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDating() {
        return dating;
    }

    public void setDating(String dating) {
        this.dating = dating;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
