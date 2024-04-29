package com.example.abiex2.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiex2.model.AbiDepartmentModel;
import com.example.abiex2.repository.AbiDepartmentRepository;

@Service
public class AbiDepartmentService {

    @Autowired
    AbiDepartmentRepository abiDepartmentRepository;

    public List<AbiDepartmentModel> getting(){
        return abiDepartmentRepository.findAll();
    }

    public void posting(AbiDepartmentModel postdata){
        abiDepartmentRepository.save(postdata);
    }
    public Optional<AbiDepartmentModel> getbyid(int id){
    return abiDepartmentRepository.findById(id);
    }
}
