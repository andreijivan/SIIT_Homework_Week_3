package com.andreijivan;

public class Album extends Book {
    String paperQuality;
    public Album(String name, int pages, String paperQuality) {
        super(name, pages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Album: " + super.toString() + "paperQuality '" + paperQuality + '\'';
    }
}
