package com.example.cy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {

    @JsonProperty("departmentName")
    private String dept;
    @JsonProperty("branch")
    private String branch;
    public Department(String dept, String branch) {
        this.dept = dept;
        this.branch = branch;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    
}
