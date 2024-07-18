package com.example.demoApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/app")
public class AppController {

    @GetMapping
    public ResponseEntity<String> getApp(){
        return ResponseEntity.ok("app is working");
    }
    @DeleteMapping
    public void deleteApp(){
        System.out.println("app is deleted successfully");
    }

}
