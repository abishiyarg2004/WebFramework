package com.example.abiex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abiex1.model.AbiAddressModel;
import com.example.abiex1.service.AbiAddressService;


@RestController
public class AbiAddressController {


    @Autowired
    public AbiAddressService abiAddressService;

     @GetMapping("/get")
    public List<AbiAddressModel> getMethodName() {
       return abiAddressService.getting();
       
    }
    @PostMapping("/post")
    public String postMethodName(@RequestBody AbiAddressModel postdata) {
       abiAddressService.posting(postdata);
        
        return "success";
    }
}
