package com.example.demo.controller;
import com.example.demo.model.Museum;
import com.example.demo.service.museum.MuseumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/museum")
@CrossOrigin("*")
public class MuseumController {
    @Autowired
    MuseumService museumService;
    @GetMapping
    public ResponseEntity<Iterable<Museum>>getAllMuseum(){
        List<Museum>list = (List<Museum>) museumService.findAll();
        if(list.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
