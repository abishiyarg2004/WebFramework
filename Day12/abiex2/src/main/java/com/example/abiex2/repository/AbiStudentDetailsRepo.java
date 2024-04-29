package com.example.abiex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abiex2.model.AbiStudentDetailsModel;

public interface AbiStudentDetailsRepo extends JpaRepository<AbiStudentDetailsModel,Integer> {

    AbiStudentDetailsModel findById(int id);
}
