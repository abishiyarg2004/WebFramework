package com.example.abiex1.abicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.abiex1.abimodel.Abichildrenmodel;
import com.example.abiex1.abiservice.Abichildrenservice;

public class Abichildrencontroller {

    @Autowired
    public Abichildrenservice childrenService;

    @GetMapping("/api/children/sortBy/{babyFirstName}")
    public ResponseEntity<List<Abichildrenmodel>> sort(@PathVariable String babyFirstName) {
         List<Abichildrenmodel> child = childrenService.sort(babyFirstName);

         if (child.isEmpty()) {

              return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(child, HttpStatus.OK);

    }

    // Pagination
    @GetMapping("api/children/{offset}/{pagesize}")
    public ResponseEntity<List<Abichildrenmodel>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
         List<Abichildrenmodel> pages = childrenService.pagination(offset, pagesize);
         if (pages.isEmpty()) {
              return new ResponseEntity<List<Abichildrenmodel>>(pages, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<List<Abichildrenmodel>>(pages, HttpStatus.OK);
    }

    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Abichildrenmodel>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
              @PathVariable String field) {
         List<Abichildrenmodel> sortedPage = childrenService.sortedPage(offset, pagesize, field);
         if (sortedPage.isEmpty()) {

              return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(sortedPage, HttpStatus.OK);
    }

    @PostMapping("/api/children")
    public ResponseEntity<Abichildrenmodel> postDetails(@RequestBody Abichildrenmodel children) {

         return new ResponseEntity<Abichildrenmodel>(childrenService.save(children), HttpStatus.CREATED);
    }

}