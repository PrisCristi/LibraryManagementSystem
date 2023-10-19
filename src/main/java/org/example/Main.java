package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void isISBNValid(Book book) {
        for (Field field : book.getClass().getDeclaredFields()) {
            Annotation annotation = field.getAnnotation(ISBN.class);
            if (annotation != null && book.getIsbn().length() > 5) {
                System.out.println("Valid ISBN");
            } else {
                System.out.println("Invalid ISBN");
            }
        }
    }

    public static void isEmailValid(Member member) {
        String regex = "^[A-Za-z0-9+_]+@(.+)$";

        for (Field field : member.getClass().getDeclaredFields()) {
            Annotation annotation = field.getAnnotation(Email.class);

            if ((annotation != null) && member.getName().matches(regex)) {

                System.out.println("Valid email");
            } else {
                System.out.println("Invalid email");
            }
        }
    }
    public static void borrowBook (Member member, Book book) {
        for (Method method : member.getClass().getDeclaredMethods()){
            ValidatedMember annotation = method.getAnnotation(ValidatedMember.class);
            if (annotation != null){
                    if (member.getBookCount()> annotation.maximumBooks() || member.getAge() < annotation.minimumAge()) {
                        System.out.println(" Invalid operation");
                    } else {
                        member.borrowBook(book);
                        System.out.println("Book has been borrowed");
                    }
            }
        }
    }
    public static void isAvailable (Inventory inventory, String ISBN) {
        for (Method method : inventory.getClass().getDeclaredMethods()){
            IsAvailable annotation = method.getAnnotation(IsAvailable.class);
            if (annotation!= null) {
                if (inventory.isAvailable (ISBN)){
                    System.out.println( "Book is available");
                } else{
                    System.out.println("Book is not available");
                }
            }
        }
    }

    public static void main(String[] args) {
        Book book = new Book("1234567");
        isISBNValid(book);

        Member member = new Member();
        member.setEmail("prisk@mail.com");
        isEmailValid(member);

        Inventory inventory = new Inventory();
        inventory.addBook(book);
        isAvailable(inventory, "12");
    }
}