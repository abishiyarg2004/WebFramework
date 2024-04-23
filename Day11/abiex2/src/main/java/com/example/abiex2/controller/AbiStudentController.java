package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.AbiStudent;
import com.example.relation.service.AbiStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AbiStudentController {
    public AbiStudentService studentService;
    public AbiStudentController(AbiStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AbiStudent postMethodName(@RequestBody AbiStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AbiStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
