package model;

public class Book {

    private String title;
    private String author;
    private Isbn isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = new Isbn(isbn);
    }

    public void showDataSheet() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn.toString());
    }

}
