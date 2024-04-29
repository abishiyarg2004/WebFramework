package com.example.abicw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abicw1.model.AbiPayroll;

public interface AbiPayrollRepo extends JpaRepository<AbiPayroll,Long>{
    
}
