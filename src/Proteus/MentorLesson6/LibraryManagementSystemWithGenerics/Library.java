package Proteus.MentorLesson6.LibraryManagementSystemWithGenerics;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void printAllBooks(){
        for(Book book: books){
            System.out.println(book);
        }
    }
}
