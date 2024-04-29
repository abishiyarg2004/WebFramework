package com.example.abiex2.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AbiDepartmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String deptname;
    public String deptemail;
    public String depthead;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    public AbiStudentModel abiStudentModel;

    public AbiDepartmentModel(int id, String deptname, String deptemail, String depthead,
            AbiStudentModel abiStudentModel) {
        this.id = id;
        this.deptname = deptname;
        this.deptemail = deptemail;
        this.depthead = depthead;
        this.abiStudentModel = abiStudentModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptemail() {
        return deptemail;
    }

    public void setDeptemail(String deptemail) {
        this.deptemail = deptemail;
    }

    public String getDepthead() {
        return depthead;
    }

    public void setDepthead(String depthead) {
        this.depthead = depthead;
    }

    public AbiStudentModel getAbiStudentModel() {
        return abiStudentModel;
    }

    public void setAbiStudentModel(AbiStudentModel abiStudentModel) {
        this.abiStudentModel = abiStudentModel;
    }
}
