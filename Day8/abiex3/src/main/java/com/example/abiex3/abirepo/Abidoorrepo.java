package com.example.abiex3.abirepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abiex3.abimodel.Abidoormodel;

public interface Abidoorrepo  extends JpaRepository<Abidoormodel,Integer>{

    List<Abidoormodel> findByDoorId(int doorId);
    List<Abidoormodel> findByAccessType(String accessType);
}
