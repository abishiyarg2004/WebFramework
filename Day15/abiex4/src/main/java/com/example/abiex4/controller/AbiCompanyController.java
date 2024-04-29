// CompanyController.java
package com.example.bankingappd15cw4.controller;

import com.example.bankingappd15cw4.model.AbiCompany;
import com.example.bankingappd15cw4.service.AbiCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class AbiCompanyController {

    private final AbiCompanyService companyService;

    @Autowired
    public AbiCompanyController(AbiCompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<AbiCompany> createCompany(@RequestBody AbiCompany company) {
        AbiCompany createdCompany = companyService.createCompany(company);
        return new ResponseEntity<>(createdCompany, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AbiCompany>> getAllCompanies() {
        List<AbiCompany> companies = companyService.getAllCompanies();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<AbiCompany> getCompanyById(@PathVariable int companyId) {
        Optional<AbiCompany> company = companyService.getCompanyById(companyId);
        return company.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{companyId}")
    public ResponseEntity<AbiCompany> updateCompany(@PathVariable int companyId, @RequestBody AbiCompany updatedCompany) {
        AbiCompany company = companyService.updateCompany(companyId, updatedCompany);
        return company != null ? new ResponseEntity<>(company, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{companyId}")
    public ResponseEntity<Void> deleteCompanyById(@PathVariable int companyId) {
        companyService.deleteCompanyById(companyId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
