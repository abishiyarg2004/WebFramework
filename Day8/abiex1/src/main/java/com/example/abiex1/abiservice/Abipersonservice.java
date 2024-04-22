package com.example.abiex1.abiservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiex1.abimodel.Abipersonmodel;
import com.example.abiex1.abirepo.Abipersonrepo;

@Service
public class Abipersonservice {

    @Autowired
     public Abipersonrepo personRepo;

     public Abipersonmodel SaveEntity(Abipersonmodel entity) {
          return personRepo.save(entity);

     }

     public List<Abipersonmodel> getDetails() {
          return personRepo.findAll();

     }

     public List<Abipersonmodel> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }
}
