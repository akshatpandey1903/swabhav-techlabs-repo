package com.aurionpro.model;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String ISBN, title, author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{ISBN=" + ISBN + ", Title=" + title + ", Author=" + author + "}";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Book)) return false;
//        Book book = (Book) obj;
//        return Objects.equals(ISBN, book.ISBN);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(ISBN);
//    }
}

