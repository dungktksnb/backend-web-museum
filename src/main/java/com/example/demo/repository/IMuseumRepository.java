package com.example.demo.repository;

import com.example.demo.model.Museum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMuseumRepository extends JpaRepository<Museum,Long> {
}
