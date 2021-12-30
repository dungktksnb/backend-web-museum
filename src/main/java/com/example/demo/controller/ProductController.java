package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")

public class ProductController {
    @Autowired
    private IProductService iProductService;
    @GetMapping
    public ResponseEntity<Iterable<Product>> findAll(){
        List<Product>products = (List<Product>) iProductService.findAll();
      if(products.isEmpty()){
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(products,HttpStatus.OK);

    }
    @PostMapping
    public  ResponseEntity<Product>saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(iProductService.save(product),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Product> editProduct(@PathVariable long id,@RequestBody Product product){
        Optional<Product> userOptional = iProductService.findById(id);
        if(!userOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        product.setName(userOptional.get().getName());
        product.setSubstance(userOptional.get().getSubstance());
        product.setDating(userOptional.get().getDating());
        product.setLocation(userOptional.get().getLocation());
        product.setImg(userOptional.get().getImg());
        product.setExperience3d(userOptional.get().getExperience3d());
        product.setContent(userOptional.get().getContent());
        return new ResponseEntity<>(iProductService.save(product),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Product>deleteProduct(@PathVariable long id){
        Optional<Product>optionalProduct=iProductService.findById(id);
        if(!optionalProduct.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        iProductService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
