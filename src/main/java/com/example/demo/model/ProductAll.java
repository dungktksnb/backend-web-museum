package com.example.demo.model;

public class ProductAll {
    private long idProduct;
    private  String experience3d;
    private  String img;
    private long idProductLanguage;
    private  String content;
    private  String dating;
    private String location;
    private  String name;
    private String substance;
    private  long language_id;
    private long product_id;
    private long idLanguage;

    public ProductAll() {
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getExperience3d() {
        return experience3d;
    }

    public void setExperience3d(String experience3d) {
        this.experience3d = experience3d;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getIdProductLanguage() {
        return idProductLanguage;
    }

    public void setIdProductLanguage(long idProductLanguage) {
        this.idProductLanguage = idProductLanguage;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(long language_id) {
        this.language_id = language_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(long idLanguage) {
        this.idLanguage = idLanguage;
    }

    public ProductAll(long idProduct, String experience3d, String img, long idProductLanguage, String content, String dating, String location, String name, String substance, long language_id, long product_id, long idLanguage) {
        this.idProduct = idProduct;
        this.experience3d = experience3d;
        this.img = img;
        this.idProductLanguage = idProductLanguage;
        this.content = content;
        this.dating = dating;
        this.location = location;
        this.name = name;
        this.substance = substance;
        this.language_id = language_id;
        this.product_id = product_id;
        this.idLanguage = idLanguage;
    }
}
