package Proteus.MentorLesson4.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList books;
    private Book book;

    public String addBook(Book book){
        books.add(book);
        return "Book " + book.getTitle() + " by " + book.getAuthor() + " is added to the library";
    }

    public void borrowBook(String title) throws BookAlreadyBorrowedException{
        if(books.contains(title)){
            book.borrowBook(title, book.getAuthor());
        }
    }

    public void returnBook(String title) throws BookNotBorrowedException{
        book.returnBook(title, book.getAuthor());
    }

    public String printAllBooks(){
        return books.toString();
    }


    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }
}
