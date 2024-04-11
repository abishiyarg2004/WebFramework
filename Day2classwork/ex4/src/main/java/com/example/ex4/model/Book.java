package com.example.ex4.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book {

    private String title;
    private String author;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
    private java.util.Date publicationDate;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public java.util.Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(java.util.Date a) {
        this.publicationDate = a;
    }
    
}
