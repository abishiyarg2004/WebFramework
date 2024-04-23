package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.AbiStudent;
import com.example.bidirection.model.AbiStudent;
import com.example.bidirection.service.AbiStudentService;
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
    @PostMapping("/api/poststudent")
    public AbiStudent postMethodName(@RequestBody AbiStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AbiStudentInfo postMethodName(@RequestBody AbiStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AbiStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}