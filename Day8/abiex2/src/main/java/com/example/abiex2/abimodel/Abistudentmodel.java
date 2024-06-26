package com.example.abiex2.abimodel;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Abistudentmodel {

    @Id
    private int id;
    private String name;
    private int age;
    private String city;
    private String rollno;

    public int getId() {
         return id;
    }

    

    public void setId(int id) {
         this.id = id;
    }

    public String getName() {
         return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public int getAge() {
         return age;
    }

    public void setAge(int age) {
         this.age = age;
    }

    public String getCity() {
         return city;
    }

    public void setCity(String city) {
         this.city = city;
    }

    public String getRollno() {
         return rollno;
    }

    public void setRollno(String rollno) {
         this.rollno = rollno;
    }

}


