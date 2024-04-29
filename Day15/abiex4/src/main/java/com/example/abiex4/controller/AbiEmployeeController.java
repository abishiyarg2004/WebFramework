// EmployeeController.java
package com.example.bankingappd15cw4.controller;

import com.example.bankingappd15cw4.model.AbiEmployee;
import com.example.bankingappd15cw4.service.AbiEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class AbiEmployeeController {

    private final AbiEmployeeService employeeService;

    @Autowired
    public AbiEmployeeController(AbiEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<AbiEmployee> createEmployee(@RequestBody AbiEmployee employee) {
        AbiEmployee createdEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AbiEmployee>> getAllEmployees() {
        List<AbiEmployee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<AbiEmployee> getEmployeeById(@PathVariable int employeeId) {
        Optional<AbiEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<AbiEmployee> updateEmployee(@PathVariable int employeeId, @RequestBody AbiEmployee updatedEmployee) {
        AbiEmployee employee = employeeService.updateEmployee(employeeId, updatedEmployee);
        return employee != null ? new ResponseEntity<>(employee, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
