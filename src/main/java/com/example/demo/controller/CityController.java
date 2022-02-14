package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

;
import java.util.List;

@RestController
@RequestMapping("/api/city")
@CrossOrigin("*")
public class CityController {
    @Autowired
    private  ICityService iCityService;
    @GetMapping
    public ResponseEntity<Iterable<City>> getCity(){
        List<City> cities= (List<City>) iCityService.findAll();

        if(cities.isEmpty()){
            return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cities,HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<City> createCity(@RequestBody City city){
        City city1= iCityService.save(city);
        return new ResponseEntity<>(city1,HttpStatus.CREATED);
    }
}
