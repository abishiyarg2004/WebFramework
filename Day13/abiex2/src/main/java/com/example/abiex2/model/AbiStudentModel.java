package com.example.abiex2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AbiStudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String email;
    public int age;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    public AbiDepartmentModel abiDepartmentModel;

    public AbiStudentModel(int id, String name, String email, int age, AbiDepartmentModel abiDepartmentModel) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.abiDepartmentModel = abiDepartmentModel;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AbiDepartmentModel getAbiDepartmentModel() {
        return abiDepartmentModel;
    }

    public void setAbiDepartmentModel(AbiDepartmentModel abiDepartmentModel) {
        this.abiDepartmentModel = abiDepartmentModel;
    }

}
