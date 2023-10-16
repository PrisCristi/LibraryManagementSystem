package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("123456789");

       Field[] fields = book.getClass().getDeclaredFields();

       for(int i = 0; i< fields.length; i++){
           Annotation annotation = fields[i].getAnnotation(ISBN.class);
           if(annotation != null && book.getISBN().length() > 6){
               System.out.println("Valid ISBN");

           }else {
               System.out.println("Invalid ISBN or the Field does not contain ISBN annotation");
           }

       }
       Member member = new Member("lena@yahoo.com");

       Field[] memberFields = member.getClass().getDeclaredFields();

       for (int i = 0; i < fields.length; i++){
           Annotation annotationMember = fields[i].getAnnotation(Email.class);
           if (annotationMember != null && member.getEmail().contains("@")) {
               System.out.println("Valid ISBN");
           } else {
               System.out.println("Invalid email or the field does not contain email annotation");

           }
       }
    }
}