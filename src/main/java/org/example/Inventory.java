package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books = new ArrayList<>();
    @IsAvailable

    public boolean isAvailable(String ISBN) {
        for (Book book:books) {
            if (book.getIsbn().equals(ISBN)){
                return true;
            }
        } return false;
    }
public void addBook (Book book) {
        books.add(book);
}



}
