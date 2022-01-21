package com.example.demo.repository;

import com.example.demo.model.ProductAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductAllRepository extends JpaRepository<ProductAll,Long> {
    @Query(nativeQuery = true,value = "select product.id          as \"idProduct\",\n" +
            "       experience3d,\n" +
            "       img,\n" +
            "       product_language.id as \"idProductLanguage\",\n" +
            "       content,\n" +
            "       dating,\n" +
            "       location,\n" +
            "       name,\n" +
            "       substance,\n" +
            "       language_id,\n" +
            "       product_id,language.id as \"idLanguage\", name_language as \"nameLanguage\"\n" +
            "from (product_language inner join product on product_language.product_id = product.id)\n" +
            "         inner join language\n" +
            "where product_language.language_id = language.id\n" +
            "  and language.name_language = 'tiếng việt';")
    Iterable<ProductAll>findAllByNameLanguage();
}
