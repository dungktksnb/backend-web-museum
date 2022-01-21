package com.example.demo.service.product;

import com.example.demo.model.Product;
import com.example.demo.model.ProductAll;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public void remove(long id) {
        iProductRepository.deleteById(id);
    }


//    @Override
//    public Iterable<ProductAll> findAllByNameLanguage() {
//        return iProductRepository.findAllByNameLanguage();
//    };
}

