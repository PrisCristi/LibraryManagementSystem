package org.example;

public class Book {
     private String id;
    @ISBN
    private String isbn;
     @BookInfo
     private String title;
     @BookInfo
     private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String ISBN) {
        this.isbn = ISBN;
    }

    public void add(Book book) {

    }
}
