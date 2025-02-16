package com.aurionpro.test;

import java.util.TreeSet;

import com.aurionpro.model.Book;

public class BookTest {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("123", "Java Programming", "Akshat"));
        books.add(new Book("456", "Data Structures", "Vatsal"));
        books.add(new Book("789", "Algorithms", "Aadit"));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}

