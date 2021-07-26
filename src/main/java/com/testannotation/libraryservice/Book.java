package com.testannotation.libraryservice;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private List<String> authors = new ArrayList<>();
    private String genre;
    private String publisher;

    public Book(){

    }
    public Book(String isbn, String title, List<String> authors, String genre, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.genre = genre;
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
