package com.example.abicw1.service;

import org.springframework.stereotype.Service;

import com.example.abicw1.model.AbiEmployee;
import com.example.abicw1.repository.AbiEmployeeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class AbiEmployeeService {
    private final AbiEmployeeRepo employeeRepo;

    public AbiEmployeeService(AbiEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public AbiEmployee createEmployee(AbiEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<AbiEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<AbiEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
