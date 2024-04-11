package com.example.cy1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cy1.model.Family;

@RestController
public class FamilyController {
    
    @Autowired
    Family f;
    @GetMapping("/family")
    public List<Family> Familyinfo(){
        List<Family> l=new ArrayList<>();
        f.setName("John");
        f.setAge(30);
        f.setRelation("father");
    l.add(f);
    return l;
    }
}
