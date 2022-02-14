package com.example.demo.service.product;


import com.example.demo.interfce.GetProduct;
import com.example.demo.model.Product;
import com.example.demo.service.IGeneral;

public interface IProductService extends IGeneral<Product> {
    Iterable<GetProduct> getProductByNameLanguageVi();
    Iterable<GetProduct> getProductByNameLanguageChamp();
    GetProduct getByNameNagaChamp();

}
