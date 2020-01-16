package com.andreijivan;

public class Main {

    public static void main(String[] args) {

        Library carturesti = new Library("Carturesti");
        Novel novel1 = new Novel("Coliba",400, "Drama");
        Novel novel2 = new Novel("Omul de creta",300, "Mystery");
        Album album1 = new Album("1001 Movies you must watch",1050,"Gloss coated");
        Album album2 = new Album("1001 places you must visit",1150,"Silk coated");

        carturesti.addBook(novel1);
        carturesti.addBook(novel1); // test for isBookAvailable.
        carturesti.addBook(novel2);
        carturesti.addBook(album1);
        carturesti.addBook(album2);

        carturesti.listBooks();

        carturesti.deleteBook(novel1);
        carturesti.listBooks();
        carturesti.deleteBook(novel1); // test for deleteBook
        System.out.println("test");

    }

}
