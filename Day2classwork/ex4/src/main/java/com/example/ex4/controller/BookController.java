package com.example.ex4.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;


@RestController
public class BookController {
  @Autowired
  Book b;

  Date a =new Date();
  
  @GetMapping("/book")
  public Object getMethodName() {
    b.setTitle("The Great Soldier");
    b.setAuthor("G. Gyan");
   
    b.setPublicationDate(a);
      return b;
  }
  
}
