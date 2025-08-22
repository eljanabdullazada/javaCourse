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

    public String getAuthor() {
        return author;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void borrowBook() throws BookAlreadyBorrowedException{
        if(getIsBorrowed()){
            throw new BookAlreadyBorrowedException("This book is already borrowed and is currently not available.");
        }
        setBorrowed(true);
    }

    public void returnBook() throws BookNotBorrowedException{
        if(!getIsBorrowed()){
            throw new BookNotBorrowedException("This book was not borrowed.");
        }
    }

    public void printInfo() {
        System.out.println(getTitle()  + " by " + getAuthor() + (isBorrowed ? " is borrowed" : " is available."));
    }
}
