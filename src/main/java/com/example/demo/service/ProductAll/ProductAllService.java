package com.example.demo.service.ProductAll;

import com.example.demo.model.ProductAll;
import com.example.demo.repository.IProductAllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class ProductAllService implements IProductAllService{
    @Autowired
    IProductAllRepository iProductAllRepository;
    @Override
    public Iterable<ProductAll> findAll() {
        return null;
    }

    @Override
    public Optional<ProductAll> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public ProductAll save(ProductAll productAll) {
        return null;
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public Iterable<ProductAll> findAllByNameLanguage() {
        return iProductAllRepository.findAllByNameLanguage();
    }
}
