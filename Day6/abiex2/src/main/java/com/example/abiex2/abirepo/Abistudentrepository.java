package com.example.abiex2.abirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abiex2.abimodel.Abistudentmodel;

public interface Abistudentrepository extends JpaRepository<Abistudentmodel,Integer> {

}
