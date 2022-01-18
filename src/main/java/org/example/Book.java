package org.example;

import org.springframework.stereotype.Component;


public class Book {
    private int yearOfpublishing;

    public Book() {
    }

    private String nameBook;

    public Book(int yearOfpublishing, String nameBook) {
        this.yearOfpublishing = yearOfpublishing;
        this.nameBook = nameBook;
    }

    public int getYearOfpublishing() {
        return yearOfpublishing;
    }

    public void setYearOfpublishing(int yearOfpublishing) {
        this.yearOfpublishing = yearOfpublishing;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }
}
