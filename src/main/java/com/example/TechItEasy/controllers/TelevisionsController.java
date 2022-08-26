package com.example.TechItEasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController {

    @GetMapping("/televisions") {
        public ResponseEntity<Object> getTelevions() {
            return ResponseEntity.ok();
        }
    }

    @GetMapping("/televisons/{id}")
    public ResponseEntity<Object> getTelevion(@PathVariable int id){
        return ResponseEntity.ok();
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> postTelevision(@RequestBody String televisionName){
        return ResponseEntity.created();
    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> putTelevion(@PathVariable int id, @RequestBody String televisionName){
        return ResponseEntity.ok();
    }

    @DeleteMapping("televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id){
        return ResponseEntity.noContent();
    }
}
