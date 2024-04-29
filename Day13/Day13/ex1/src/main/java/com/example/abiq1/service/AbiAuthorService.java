package com.example.abiq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiq1.model.AbiAuthor;
import com.example.abiq1.repository.AbiAuthorRepository;

@Service
public class AbiAuthorService {
    @Autowired
    private AbiAuthorRepository authorRepository;

    public AbiAuthor saveAuthor(AbiAuthor author) {
        return authorRepository.save(author);
    }

    public AbiAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AbiAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AbiAuthor updateAuthor(Long id, AbiAuthor author) {
        AbiAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
