// PersonService.java
package com.example.bankingappd15cw1.service;

import com.example.bankingappd15cw1.model.AbdulPerson;
import com.example.bankingappd15cw1.repository.AbdulPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbiPersonService {

    private final AbdulPersonRepository personRepository;

    @Autowired
    public AbiPersonService(AbdulPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Implement CRUD operations for Person entity

    public AbdulPerson createPerson(AbdulPerson person) {
        return personRepository.save(person);
    }

    public List<AbdulPerson> getAllPersons() {
        return personRepository.findAll();
    }

    public AbdulPerson getPersonById(int id) {
        return personRepository.findById(id);
    }

    public void deletePerson(int id) {
        personRepository.delete(id);
    }
}
