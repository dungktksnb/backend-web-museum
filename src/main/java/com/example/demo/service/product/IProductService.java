package com.example.demo.service.product;


import com.example.demo.interfce.GetProduct;
import com.example.demo.model.Product;
import com.example.demo.service.IGeneral;

import java.util.List;

public interface IProductService extends IGeneral<Product> {
    GetProduct getByNameKaLa();
    GetProduct getByNameNaga();
    GetProduct getByNameNagaChamp();
    List<Product>findAllById(long id);



}
