package com.example.abiex2.abicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.abiex2.abimodel.Abicoursemodel;
import com.example.abiex2.abiservice.Abicourseservice;

public class Abicoursecontroller {

    @Autowired
     public Abicourseservice CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<Abicoursemodel> postMethodName(@RequestBody Abicoursemodel entity) {

        Abicoursemodel inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<Abicoursemodel>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<Abicoursemodel>> getMethodName() {

          List<Abicoursemodel> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Abicoursemodel>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Abicoursemodel>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<Abicoursemodel> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}

