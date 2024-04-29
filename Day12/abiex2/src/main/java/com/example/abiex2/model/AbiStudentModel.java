package com.example.abiex2.model;

import org.hibernate.annotations.CascadeType;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class AbiStudentModel {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @OneToOne()
    @JoinColumn(name = "fk_id",referencedColumnName = "id")
    AbiStudentDetailsModel studentDetail;

    public AbiStudentModel() {
    }

    public AbiStudentModel(int id, String name, int age, AbiStudentDetailsModel studentDetail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.studentDetail = studentDetail;
    }

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

    public AbiStudentDetailsModel getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(AbiStudentDetailsModel studentDetail) {
        this.studentDetail = studentDetail;
    }
}


