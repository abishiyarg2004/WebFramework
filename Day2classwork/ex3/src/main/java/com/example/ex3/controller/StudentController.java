package com.example.ex3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex3.model.Student;

@RestController
public class StudentController {


    @Autowired
    Student stu;

    @GetMapping("/student")
    public Object ans(){
        stu.setName("John");
        stu.setId(1L);
        stu.setDescription("This is a student description");
        return stu;
    }
}
