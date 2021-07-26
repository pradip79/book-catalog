package com.testannotation.libraryservice;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BookRepository {
    private final Map<String, Book> BOOKS = Map.of(
            "101201", new Book("101201", "The Alchemist", Arrays.asList("Paolo Coelho"), "Fiction", "HarperCollins"),
            "101202", new Book("101202", "The Monk Who Sold His Ferrari", Arrays.asList("Robin Sharma"), "Fiction", "HarperCollins"),
            "101203", new Book("101203", "Testing Java Microservices", Arrays.asList("Alex Bueno", "Andy Gumbrecht", "Jason Porter"), "Technical", "Manning"),
            "101204", new Book("101204", "The Cucumber Book", Arrays.asList("Matt Wynne", "Aslak Hellesoy", "Steve Tooke"), "Technical", "Pragmatic")
    );

    public List<Book> getAll() {
        Book book1 = new Book();
        Book book2 = new Book();
        List<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(book1, book2));
        return List.copyOf(BOOKS.values());
    }

    public Optional<Book> getById(String isbn){
        return Optional.ofNullable(BOOKS.get(isbn));
    }
}
