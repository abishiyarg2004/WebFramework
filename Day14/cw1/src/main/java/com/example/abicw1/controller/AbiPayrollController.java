package com.example.abicw1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.abicw1.model.AbiPayroll;
import com.example.abicw1.service.AbiPayrollService;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class AbiPayrollController {
    private final AbiPayrollService payrollService;

    public AbiPayrollController(AbiPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<AbiPayroll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody AbiPayroll payroll) {
        AbiPayroll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<AbiPayroll> getPayrollForEmployee(@PathVariable Long employeeId) {
        AbiPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
