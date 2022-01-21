package com.example.demo.repository;

import com.example.demo.model.ProductLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IProductLanguageRepository extends JpaRepository<ProductLanguage,Long> {
    @Query(nativeQuery = true,value = "select *\n" +
            "from (language inner join product_language pl on language.id = pl.language_id)\n" +
            "         inner join product on product.id = pl.product_id\n" +
            "where language.name_language like '%việt'")
     Iterable<List<ProductLanguage>> find ();

}
