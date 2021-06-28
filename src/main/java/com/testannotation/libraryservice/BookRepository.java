package com.testannotation.libraryservice;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class BookRepository {
    private final Map<String, Book> BOOKS = Map.of(
            "101201", new Book("101201", "Book1", "Author1;Author2"),
            "101202", new Book("101202", "Book2", "Author3"),
            "101203", new Book("101203", "Book3", "Author2;Author4")
    );

    public List<Book> getAll() {
        return List.copyOf(BOOKS.values());
    }

    public Optional<Book> getById(String isbn){
        return Optional.ofNullable(BOOKS.get(isbn));
    }
}
