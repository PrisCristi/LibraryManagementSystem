package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    // ArrayList
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // HashMap + add and remove methods.
    private HashMap<Integer, Book> bookMap;

    public void addBook(int id, Book book) {
        bookMap.put(id, book);
    }
    public void removeBook(int id) {
        bookMap.remove(id);
    }
    // HashSet + add and remove methods.
    private HashSet<Book> favoriteBook;

    public Library(HashSet<Book> favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public void addFavoriteBook (Book book){
        favoriteBook.add(book);
    }
    public void removeFavoritBook(Book book){
        removeFavoritBook(book);
    }
    public Book findBookId (String id) {
        for (Book book : favoriteBook){
            if (book.getId() ==id){
                return book;
            }
        }
        return null;
    }
    public void seachByAuthor(String author){
        System.out.println("Book by " + author);

        for (Book book : favoriteBook){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book.getTitle());
            }
        }
    }
    public void seachByBooks(String title){
        System.out.println("Title of the book: " + title);

        for (Book book : favoriteBook){
            if (book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getTitle() + "by" + book.getAuthor());
            }
        }
        public void displayBooks( ){
            if (favoriteBook.isEmpty()){

                System.out.println("No books available");
            }
        }
        System.out.println("Book available: ");
        for (Book book:favoriteBook) {
            System.out.println("Title: " + book.getTitle());
            System.out.println();
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
            System.out.println("Id: " + book.getId());
            System.out.println();
            System.out.println("ISBN: " + book.getIsbn());

        }
    }
}

