package com.example.abicw1.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abicw1.model.AbiEmployee;

public interface AbiEmployeeRepo extends JpaRepository<AbiEmployee, Long> {
}
