package com.example.ex5.controlller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex5.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
     @GetMapping("/student")
     public List<Student> getMethodName() {
         List<Student> l=new ArrayList<>();
        Student s1=new Student();
        s1.setStudentName("John");
        s1.setMessage("Welcome, John!");
        l.add(s1);
        Student s2=new Student();
        s2.setStudentName("Joe");
        s2.setMessage("Welcome, Joe!");
        l.add(s2);


         return l;
     }
     
}
