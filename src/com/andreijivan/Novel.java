package com.andreijivan;

public class Novel extends Book {
    String type;

    public Novel(String name, int pages, String type) {
        super(name, pages);
        this.type = type;
    }


    @Override
    public String toString() {
        return "Novel: " + super.toString() + "type '" + type + '\'';
    }
}
