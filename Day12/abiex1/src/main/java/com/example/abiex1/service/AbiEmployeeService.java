package com.example.abiex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiex1.model.AbiEmployeeModel;
import com.example.abiex1.repository.AbiEmployeeRepository;

@Service
public class AbiEmployeeService {

    @Autowired
    public AbiEmployeeRepository abiEmployeeRepository;

    
    public String posting(AbiEmployeeModel postdata){
        abiEmployeeRepository.save(postdata);
    return null;
    }

    public List<AbiEmployeeModel> getting() {
        return abiEmployeeRepository.findAll();
    }
}
