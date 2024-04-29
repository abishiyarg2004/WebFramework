package com.example.abiex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abiex1.model.AbiEmployeeModel;

@Repository
public interface AbiEmployeeRepository extends JpaRepository<AbiEmployeeModel,Integer> {

}
