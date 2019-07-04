package com.rho.books.bean;

public class Book {
    private final String author;
    private final String title;
    private final BookType type;
    private final int nrPages;


    public Book(String author, String title, BookType type, int nrPages) {
        this.author = author;
        this.title = title;
        this.type = type;
        this.nrPages = nrPages;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookType getType() {
        return type;
    }

    public int getNrPages() {
        return nrPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", nrPages=" + nrPages +
                '}';
    }
}
