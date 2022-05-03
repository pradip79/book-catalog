package com.testannotation.libraryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public ResponseEntity<Book> getBookByISBN(@PathVariable("id") String isbn) {
        Optional<Book> book = bookRepository.getById(isbn);
        return ResponseEntity.of(book);
    }

    @PostMapping("/book-catalog/books")
    public List<Book> searchBooks(@RequestBody List<SearchKey> searchKeys) {
        List<Book> searchedBooks = new ArrayList<>();
        for(SearchKey searchKey: searchKeys){
            bookRepository.getById(searchKey.getIsbn()).ifPresent((book) -> searchedBooks.add(book));
        }
        return searchedBooks;
    }
}
