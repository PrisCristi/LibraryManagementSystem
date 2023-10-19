package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
   private List<Book> books = new ArrayList<>();

   @Email
   private String email;
   private String id;
   private String name;
   private int age;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @ValidatedMember(maximumBooks = 5, minimumAge = 10)
    public void borrowBook (Book book) {
        book.add(book);
    }
    public int getBookCount() {
        return books.size();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
