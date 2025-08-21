package Proteus.MentorLesson4.LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;


    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String borrowBook(String title, String author) throws BookAlreadyBorrowedException{
        if(!isBorrowed){
            isBorrowed = true;
            return "Borrowed " + title + " by " + author;
        }
        throw new BookAlreadyBorrowedException("This book is already borrowed");
    }

    public String returnBook(String title, String author) throws BookNotBorrowedException{
        if(isBorrowed){
            isBorrowed = false;
            return "Returned " + title + " by " + author;
        }
        throw new BookNotBorrowedException("This book is already returned");
    }

    public String printInfo() {
        return title  + " by " + author;
    }
}
