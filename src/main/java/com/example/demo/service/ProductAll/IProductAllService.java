package com.example.demo.service.ProductAll;

import com.example.demo.model.ProductAll;
import com.example.demo.service.IGeneral;


public interface IProductAllService extends IGeneral<ProductAll> {
    Iterable<ProductAll>findAllByNameLanguage();
}
