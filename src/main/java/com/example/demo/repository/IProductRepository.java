package com.example.demo.repository;

import com.example.demo.interfce.GetProduct;
import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query(nativeQuery = true,value = "select img          as imgProduct,\n" +
            "       experience3d as experience3dProduct,\n" +
            "       name         as nameProduct,\n" +
            "       content      as contenProdcut,\n" +
            "       dating       as datingProduct,\n" +
            "       substance    as substanceProduct,\n" +
            "       location     as locationProduct,\n" +
            "       sound        as soundProduct\n" +
            "from product_language\n" +
            "         join product p on product_language.product_id = p.id\n" +
            "         join language l on l.id = product_language.language_id where name_language ='tiếng việt' and name='kala'")
    GetProduct getProductByName ();
    @Query(nativeQuery = true,value = "select img          as imgProduct,\n" +
            "       experience3d as experience3dProduct,\n" +
            "       name         as nameProduct,\n" +
            "       content      as contenProdcut,\n" +
            "       dating       as datingProduct,\n" +
            "       substance    as substanceProduct,\n" +
            "       location     as locationProduct,\n" +
            "       sound        as soundProduct\n" +
            "from product_language\n" +
            "         join product p on product_language.product_id = p.id\n" +
            "         join language l on l.id = product_language.language_id where name_language ='tiếng việt' ")
    GetProduct getProductBy();

}
