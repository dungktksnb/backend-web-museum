package com.example.demo.controller;

import com.example.demo.model.Video;
import com.example.demo.service.video.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/videos")
@CrossOrigin("*")
public class VideoController {
    @Autowired
   private VideoService videoService;
    @GetMapping()
    public ResponseEntity<Iterable<Video>> findAllVideo(){
        List<Video> list= (List<Video>) videoService.findAll();
        if (list.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }return new ResponseEntity<>(list,HttpStatus.OK);

    }
//    @GetMapping("/{id}")
//    public  ResponseEntity<Optional<Video>>findById(@Valid @PathVariable long id, @RequestBody Video video){
//      Optional<Video>optionalVideo= videoService.findById(id);
//      if(optionalVideo.isPresent()
//      ){
//          optionalVideo.
//      }
//    }
    @PostMapping("/createVideo")
    public  ResponseEntity<Video> createVideo(@RequestBody Video video){
       Video video1= videoService.save(video);
        return new ResponseEntity<>(video1,HttpStatus.OK);

    }

}
