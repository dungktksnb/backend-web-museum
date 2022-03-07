package com.example.demo.controller;

import com.example.demo.dto.response.Response;
import com.example.demo.dto.response.ResponseBody;
import com.example.demo.interfce.GetProduct;
import com.example.demo.model.Product;
import com.example.demo.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable long id) {
        Optional<Product> optionalProduct = productService.findById(id);
        if (!optionalProduct.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        productService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/vi")
    public ResponseEntity<Iterable<GetProduct>> getByNameKaLa(){
       List<GetProduct>list= (List<GetProduct>) productService.getProductByNameLanguageVi();
       if(list.isEmpty()){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }return new ResponseEntity<>(list,HttpStatus.OK);
    }


    @GetMapping("/naga-champ")
    public ResponseEntity<GetProduct> getByNameNagaChamp(){
        return new ResponseEntity<>(productService.getByNameNagaChamp(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable long id){
        return new ResponseEntity(new ResponseBody(Response.OBJECT_INVALID,null),HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/champ")
    public ResponseEntity<Iterable<GetProduct>>getProductByNameLanguageChamp(){
        List<GetProduct>list= (List<GetProduct>) productService.getProductByNameLanguageChamp();
        if (list.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/getAllProducts")
    public  ResponseEntity<Iterable<GetProduct>>getAll(){
        List<GetProduct>list= (List<GetProduct>) productService.getProduct();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
