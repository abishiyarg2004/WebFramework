// PersonController.java
package com.example.bankingappd15cw1.controller;

import com.example.bankingappd15cw1.model.AbiPerson;
import com.example.bankingappd15cw1.service.AbiPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class AbiPersonController {

    private final AbiPersonService personService;

    @Autowired
    public AbiPersonController(AbiPersonService personService) {
        this.personService = personService;
    }

    // CRUD operations endpoints

    @PostMapping
    public ResponseEntity<AbiPerson> createPerson(@RequestBody AbiPerson person) {
        AbiPerson createdPerson = personService.createPerson(person);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AbiPerson>> getAllPersons() {
        List<AbiPerson> persons = personService.getAllPersons();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbiPerson> getPersonById(@PathVariable int id) {
        AbiPerson person = personService.getPersonById(id);
        if (person != null) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
