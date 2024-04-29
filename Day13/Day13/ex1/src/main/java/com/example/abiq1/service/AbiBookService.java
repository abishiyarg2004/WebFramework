package com.example.abiq1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiq1.model.AbiAuthor;
import com.example.abiq1.model.AbiBook;
import com.example.abiq1.repository.AbiAuthorRepository;
import com.example.abiq1.repository.AbiBookRepository;

@Service
public class AbiBookService {
    @Autowired
    private AbiBookRepository bookRepository;
@Autowired
private AbiAuthorRepository authorRepository;
    public AbiBook saveBook(Long authorId, AbiBook book) {
        AbiAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AbiBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

