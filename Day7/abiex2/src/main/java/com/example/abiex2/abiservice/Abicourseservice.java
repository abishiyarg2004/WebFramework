package com.example.abiex2.abiservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.abiex2.abimodel.Abicoursemodel;
import com.example.abiex2.abirepo.Abicourserepo;

public class Abicourseservice {

    @Autowired
    public Abicourserepo courseRepo;

    public Abicoursemodel SaveEntity(Abicoursemodel entity) {
         return courseRepo.save(entity);

    }

    public List<Abicoursemodel> getDetails() {
         return courseRepo.findAll();

    }

    public List<Abicoursemodel> findByCourseName(String courseName) {
         return courseRepo.findByCourseName(courseName);
    }
}
