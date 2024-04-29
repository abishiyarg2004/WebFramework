package com.example.abiex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.abiex2.model.AbiStudentModel;
import com.example.abiex2.service.AbiStudentService;

public class AbiStudentController {

     @Autowired
    AbiStudentService ser;

    @PostMapping("/student")
    public AbiStudentModel post(@RequestBody AbiStudentModel s)
    {
        return ser.post(s);
    }

    @GetMapping("students-inner-join")
    public List<AbiStudentModel> innerjoin()
    {
        return ser.innerjoin();
    }

    @GetMapping("students-left-outer-join")
    public List<AbiStudentModel> leftjoin()
    {
        return ser.leftjoin();
    }
}



