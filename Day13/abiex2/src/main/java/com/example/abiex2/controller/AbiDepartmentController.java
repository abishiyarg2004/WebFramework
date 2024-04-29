package com.example.abiex2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.abiex2.model.AbiDepartmentModel;
import com.example.abiex2.service.AbiDepartmentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AbiDepartmentController {

    @Autowired
   AbiDepartmentService abiDepartmentService;

    @GetMapping("/get")
    public List<AbiDepartmentModel> getMethodName() {
        return abiDepartmentService.getting();
    }
    
  @GetMapping("/getbyname")
  public Optional<AbiDepartmentModel> getbyname(@RequestParam int id) {
      return abiDepartmentService.getbyid(id);
  }

  @PostMapping("/post")
  public String postMethodName(@RequestBody AbiDepartmentModel postdata) {
      //TODO: process POST request
     abiDepartmentService.posting(postdata);
      return "success";
  }
  
  
}
