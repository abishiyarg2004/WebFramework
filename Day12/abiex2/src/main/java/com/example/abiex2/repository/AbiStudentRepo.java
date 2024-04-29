package com.example.abiex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abiex2.model.AbiStudentModel;

public interface AbiStudentRepo extends JpaRepository<AbiStudentModel,Integer> {
    AbiStudentModel findById(int id);  
}

