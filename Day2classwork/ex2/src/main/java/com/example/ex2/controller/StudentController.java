package com.example.ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex2.model.Student;

@RestController
public class StudentController {
    
    @Autowired
    Student stu;
    
    @GetMapping("/students")
    public Object ans(){
       stu.setName("Nithish");
       stu.setAge(22);
        return stu;
    }
}
