package com.example.cy2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cy2.model.College;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CollegeController {

    @GetMapping("path")
    public College getMethodName() {
        College c=new College("ABC College", "Computer Science", 1);
        return c;
    }
    
}
