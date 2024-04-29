package com.example.abiex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abiex1.model.AbiAddressModel;

@Repository
public interface AbiAddressRepository  extends JpaRepository<AbiAddressModel,Integer>{

}
