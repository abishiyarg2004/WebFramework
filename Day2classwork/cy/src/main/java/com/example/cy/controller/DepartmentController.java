package com.example.cy.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cy.model.Department;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class DepartmentController {

    @PostMapping("/department")
    public String PostMethodName(@RequestBody Department d) {
        d.setDept("cse");
        d.setBranch("BE");
        return "Department Name: "+d.getDept()+", Branch: "+d.getBranch();
    }
    
}
