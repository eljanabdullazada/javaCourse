package Proteus.MentorLesson4.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;
    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book " + book.getTitle() + " by " + book.getAuthor() + " is added to the library.");;
    }

    public void borrowBook(String title) throws BookAlreadyBorrowedException{
        for(Book b: books){
            if(b.getTitle().equals(title)){
                if(!b.getIsBorrowed()){
                    b.borrowBook();
                    System.out.println("Borrowed " + b.getTitle() + " by " + b.getAuthor());
                    return;
                }
            }
        }
        throw new BookNotFoundException("Could not find book with this name to borrow.");
    }

    public void returnBook(String title) throws BookNotBorrowedException{
        for(Book b: books){
            if(b.getTitle().equals(title)){
                if(b.getIsBorrowed()){
                    b.returnBook();
                    System.out.println("Returned " + b.getTitle() + " by " + b.getAuthor());
                    return;
                }
            }
        }
        throw new BookNotFoundException("Could not find book with this name to return.");
    }

    public void printAllBooks(){
        System.out.println("Information about all the available books in library " + getName() + ": \n");
        for (Book b: books){
              b.printInfo();
        }
    }

    public String getName() {
        return name;
    }
}
