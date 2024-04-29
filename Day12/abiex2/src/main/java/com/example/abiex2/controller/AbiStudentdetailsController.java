package com.example.abiex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.abiex2.model.AbiStudentDetailsModel;
import com.example.abiex2.service.AbistudentDetailsService;

public class AbiStudentdetailsController {

     @Autowired
    AbistudentDetailsService ser;

    @PutMapping("/studentDetail/student/{id}")
    public AbiStudentDetailsModel post(@RequestBody AbiStudentDetailsModel s,@PathVariable int id)
    {
        return ser.post(s, id);
    }
}
