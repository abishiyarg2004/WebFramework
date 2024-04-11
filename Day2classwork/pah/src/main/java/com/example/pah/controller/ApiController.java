package com.example.pah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.pah.config.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {

    @Autowired
    AppConfig ac;

    @GetMapping("/info")
    public String getMethodName() {
        return "Student Name: "+ac.getStudentName()+", Department: "+ac.getStudentDepartment();
    }
    
}
