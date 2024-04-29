package com.example.abicw2.service;

import org.springframework.stereotype.Service;

import com.example.abicw2.model.AbiBook;
import com.example.abicw2.repository.AbiBookRepo;

import java.util.List;

@Service
public class AbiBookService {
    private final AbiBookRepo bookRepo;

    public AbiBookService(AbiBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public AbiBook createBook(AbiBook Book) {
        return bookRepo.save(Book);
    }
    public List<AbiBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public AbiBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public AbiBook updateBookById(Long id,AbiBook book){
        AbiBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
