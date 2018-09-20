package com.company.Practice;

public class Book {
    private String author;
    private int nrOfPages;
    private static int nrOfOpenings;

    public Book(String author, int nrOfPages, int nrOfOpenings) {
        this.author = author;
        this.nrOfPages = nrOfPages;
      
    }

    public void open(){
        nrOfOpenings++;
    }

    public String getAuthor() {
        return author;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public static int getNrOfOpenings() {
        return nrOfOpenings;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nrOfPages=" + nrOfPages +
                '}';
    }
}
