package com.example.springapp.abicontroller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.abimodel.AbiPerson;
import com.example.springapp.abiservice.AbiPersonservice;

@RestController
public class AbiPersoncontroller {
    public AbiPersonservice personService;

    public AbiPersoncontroller(AbiPersonservice personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<AbiPerson> postMethodName(@RequestBody AbiPerson person) {
        if (personService.savePerson(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<AbiPerson>> getMethodName(@PathVariable("age") int age) {
        List<AbiPerson> list = personService.getPersonByAge(age);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
