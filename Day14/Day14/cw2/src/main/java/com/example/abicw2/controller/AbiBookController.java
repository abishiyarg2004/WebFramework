package com.example.abicw2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.abicw2.model.AbiBook;
import com.example.abicw2.service.AbiBookService;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class AbiBookController {
    private final AbiBookService bookService;

    public AbiBookController(AbiBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<AbiBook> createBook(@RequestBody AbiBook Book) {
        AbiBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<AbiBook>> getAllBooks() {
        List<AbiBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public AbiBook updateBookById(@PathVariable Long bookId,@RequestBody AbiBook book){
        AbiBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public AbiBook getBookById(@PathVariable Long bookId) {
        AbiBook book = bookService.getBookById(bookId);
        return book;
    }
}
