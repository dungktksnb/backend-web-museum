package com.example.demo.controller;

import com.example.demo.model.Nation;
import com.example.demo.service.nation.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nation")
public class NationController {
    @Autowired
    private NationService nationService;
    @GetMapping
    public ResponseEntity<Iterable<Nation>>getAllNation(){
        List<Nation>list= (List<Nation>) nationService.findAll();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
