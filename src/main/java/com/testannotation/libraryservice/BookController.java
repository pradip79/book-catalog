package com.testannotation.libraryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @GetMapping("/book-catalog/books")
    public List<Book> getAllBooks() {
        return bookRepository.getAll();
    }

    @GetMapping("/book-catalog/book/{id}")
    public ResponseEntity<Book> getProductById(@PathVariable("id") String isbn) {
        Optional<Book> book = bookRepository.getById(isbn);
        return ResponseEntity.of(book);
    }
}
