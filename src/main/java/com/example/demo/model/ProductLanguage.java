package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//không cần i18n vẫn xử lý được đoạn ngôn ngữ.

@Entity
@Data
public class ProductLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;//id
    private String name;//tên
    private String content ;// nội dung
    private String dating;//niên đại
    private String substance;//chất liệu
    private String location;//địa điểm phát hiện
    private  String sound;
    @ManyToOne
    private Product product;
    @ManyToOne
    private  Language language;

}
