package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    @ManyToOne
    private ProductLanguage productLanguage;

    public Language() {
    }

    public Language(Long id, String name, ProductLanguage productLanguage) {
        this.id = id;
        this.name = name;
        this.productLanguage = productLanguage;
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

    public ProductLanguage getProductLanguage() {
        return productLanguage;
    }

    public void setProductLanguage(ProductLanguage productLanguage) {
        this.productLanguage = productLanguage;
    }
}
