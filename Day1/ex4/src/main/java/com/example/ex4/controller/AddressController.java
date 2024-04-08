package com.example.ex4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AddressController {

    @GetMapping("/address")
    public Object getAddress() {
        Address a=new Address();
         a.setName("Abi");
         a.setDoorNo(123);
         a.setStreetName("Main St");
         a.setPincode(12345);
         a.setArea("Saralvilai");
         a.setDistrict("Kanyakumari");
         a.setState("Tm");
         a.setCountry("India");
         return a;
    }
    
   
}
