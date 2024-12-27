package model;

import java.util.ArrayList;

public class Library {

    public String name;
    public Librarian librarian;
    public ArrayList<Book> books;

    public Library(String name, Librarian librarian) {
        this.name = name;
        this.librarian = librarian;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void printBooks() {
        System.out.println(name + " Library");
        System.out.println("Booklist: ");
        for (Book book : books) {
            book.showDataSheet();
        }
    }

}
