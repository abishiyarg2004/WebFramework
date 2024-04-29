package com.example.abiex2.model;

import org.hibernate.annotations.CascadeType;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class AbiStudentDetailsModel {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String address,phoneNumber;

    @OneToOne( mappedBy = "studentDetail")
    AbiStudentModel student;

    public AbiStudentDetailsModel() {
    }

    public AbiStudentDetailsModel(int id, String address, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
