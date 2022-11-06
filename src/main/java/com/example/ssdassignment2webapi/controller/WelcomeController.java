package com.example.ssdassignment2webapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/welcome")
@CrossOrigin(origins ="*",allowedHeaders = "*",exposedHeaders = "*")
public class WelcomeController {

    @GetMapping
    public String sayWelcome(){
        return "Welcome";
    }
}
