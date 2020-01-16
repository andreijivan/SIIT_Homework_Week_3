package com.andreijivan;

public class Book {
    String name;
    int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  name + ", pages: " + pages + " ";
    }

}
