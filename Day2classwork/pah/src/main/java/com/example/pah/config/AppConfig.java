package com.example.pah.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${name}")
    private String studentName;
    @Value("${Department}")
    private String studentDepartment;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    
}
