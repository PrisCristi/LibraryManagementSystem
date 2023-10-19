package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books;
    public ArrayList<Book> getBooks() {
        return books;
    }
    private ArrayList<Member> members;
    public ArrayList<Member> getMembers(){
        return members;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    private HashMap<Integer, Book> bookMap;
    public void addBook(int id, Book book) {
        bookMap.put(id, book);
    }
    public void removeBook(int id) {
        bookMap.remove(id);
    }
    private HashSet<Book> favoriteBook;
    public Library(HashSet<Book> favoriteBook) {
        this.favoriteBook = favoriteBook;
    }
    public void addFavoriteBook (Book book){
        favoriteBook.add(book);
    }
    public void removeFavoritBook(Book book){
        favoriteBook.remove(book);
    }
    public Book findBookId (String id) {
        for (Book book : favoriteBook){
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public List<Book> searchBooksByTitleOrAuthor(String query) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query))
                .collect(Collectors.toList());
    }
    public List<Member>sortMembersByName(){
        return members.stream()
                .sorted(Comparator.comparing(Member::getName))
                .collect(Collectors.toList());
    }
    public void seachByBooks(String title){
        System.out.println("Title of the book: " + title);

        for (Book book : favoriteBook){
            if (book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getTitle() + "by" + book.getAuthor());
            }
        }

        public void displayBooks(){
            if(favoriteBook.isEmpty()) {
                System.out.println("No books available");
                return;
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
}

