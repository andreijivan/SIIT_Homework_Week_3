package com.andreijivan;

import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook (Book book){
        if (isBookAvailable(book)) System.out.println(book.name + " already in library");
        else {books.add(book);
            System.out.println("New book added to " + this.name + " library: " + book);}
    }

    public void deleteBook (Book book){
        if (!isBookAvailable(book)) System.out.println(book.name + " not in library");
        else {books.remove(book);
            System.out.println("Book deleted from " + this.name + ": " + book);}
    }

    public void listBooks (){
        System.out.println(this.name + " library books are:");
        for (Book b: books)  System.out.println(b);
    }
    private boolean isBookAvailable(Book book){
        for (Book b: books) if (b.name.toLowerCase().equals(book.name.toLowerCase())) return true;
             return false;
    }

}
