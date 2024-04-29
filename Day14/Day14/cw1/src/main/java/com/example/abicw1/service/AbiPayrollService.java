package com.example.abicw1.service;

import org.springframework.stereotype.Service;

import com.example.abicw1.model.AbiPayroll;
import com.example.abicw1.repository.AbiPayrollRepo;

@Service
public class AbiPayrollService {
    private final AbiPayrollRepo payrollRepo;

    public AbiPayrollService(AbiPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public AbiPayroll createPayroll(AbiPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public AbiPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
