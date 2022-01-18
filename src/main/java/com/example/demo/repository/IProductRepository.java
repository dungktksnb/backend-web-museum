package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "select \n" +
            "from product_language,\n" +
            "     product\n" +
            "where museum.product.id = museum.product_language.product_id\n" +
            "  and product_language.language_id = 2",nativeQuery = true)

     Iterable<Product>findAlll();
}
