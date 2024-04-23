package com.example.springapp.abiservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.abimodel.AbiPerson;
import com.example.springapp.abirepo.AbiPersonrepo;

@Service
public class AbiPersonservice {
    public AbiPersonrepo personRepo;

    public AbiPersonservice(AbiPersonrepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AbiPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AbiPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
