package com.example.ex1.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String welcomegreet(){
     return "Welcome Spring Boot!";
    }
}