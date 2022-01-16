package com.example.demo.repository;

import com.example.demo.model.ProductLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IProductLanguageRepository extends JpaRepository<ProductLanguage,Long> {

}
