package com.example.abicw1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.abicw1.model.AbiEmployee;
import com.example.abicw1.service.AbiEmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class AbiEmployeeController {
    private final AbiEmployeeService employeeService;

    public AbiEmployeeController(AbiEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<AbiEmployee> createEmployee(@RequestBody AbiEmployee employee) {
        AbiEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<AbiEmployee>> getAllEmployees() {
        List<AbiEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<AbiEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<AbiEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

