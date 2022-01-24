package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String img;//ảnh sản phẩm
    private String experience3d;//trải nghiệm 3d


}
