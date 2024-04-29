package com.example.abiex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiex1.model.AbiAddressModel;

import com.example.abiex1.repository.AbiAddressRepository;


@Service
public class AbiAddressService {

    @Autowired
     public AbiAddressRepository abiAddressRepository;

   

    public String posting(AbiAddressModel postdata){
        abiAddressRepository.save(postdata);
    return null;
    }

    public List<AbiAddressModel> getting() {
        return abiAddressRepository.findAll();
    }
}
