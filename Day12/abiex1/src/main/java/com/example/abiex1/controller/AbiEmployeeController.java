package com.example.abiex1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.abiex1.model.AbiEmployeeModel;
import com.example.abiex1.service.AbiEmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AbiEmployeeController {

    @Autowired
    public AbiEmployeeService abiEmployeeService;

    @GetMapping("/get")
    public List<AbiEmployeeModel> getMethodName() {
        return abiEmployeeService.getting();
    }
    @PostMapping("/post")
    public String postMethodName(@RequestBody AbiEmployeeModel postdata) {
       abiEmployeeService.posting(postdata);
        
        return "success";
    }
    
    
}
