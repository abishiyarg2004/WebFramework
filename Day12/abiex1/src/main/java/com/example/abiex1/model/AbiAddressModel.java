package com.example.abiex1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AbiAddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String city;
    public String street;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    public AbiEmployeeModel abiEmployeeModel;
    
}
