// Company.java
package com.example.bankingappd15cw4.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class AbiCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;
    private String name;
    private String address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<AbiEmployee> employees;

    // Constructors
    public AbiCompany() {
    }

    public AbiCompany(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<AbiEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<AbiEmployee> employees) {
        this.employees = employees;
    }
}
