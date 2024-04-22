package com.example.abiex1.abicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.abiex1.abimodel.Abipersonmodel;
import com.example.abiex1.abiservice.Abipersonservice;

public class Abipersoncontroller {
    @Autowired
    public Abipersonservice personService;

    @PostMapping("/api/person")
    public ResponseEntity<Abipersonmodel> postMethodName(@RequestBody Abipersonmodel entity) {

        Abipersonmodel inst = personService.SaveEntity(entity);

         return new ResponseEntity<Abipersonmodel>(inst, HttpStatus.CREATED);

    }

    @GetMapping("/api/person")
    public ResponseEntity getMethodName() {

         List<Abipersonmodel> show = personService.getDetails();
         if (!show.isEmpty()) {
              return new ResponseEntity<List<Abipersonmodel>>(HttpStatus.OK);
         } else {
              return new ResponseEntity<List<Abipersonmodel>>(HttpStatus.NOT_FOUND);
         }
    }

    @GetMapping("api/person/byAge")
    public List<Abipersonmodel> custom(@RequestParam int byAge) {
         return personService.findByAge(byAge);

    }
}