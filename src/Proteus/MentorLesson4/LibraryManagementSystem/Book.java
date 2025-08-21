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

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String borrowBook(String title, String author) throws BookAlreadyBorrowedException{
        if(!getIsBorrowed()){

            return "Borrowed " + title + " by " + author;
        }
        throw new BookAlreadyBorrowedException("This book is already borrowed");
    }

    public String returnBook(String title, String author) throws BookNotBorrowedException{
        if(getIsBorrowed()){
            setBorrowed(false);
            return "Returned " + getTitle() + " by " + getAuthor();
        }
        throw new BookNotBorrowedException("This book is already returned");
    }

    public String printInfo() {
        return getTitle()  + " by " + getAuthor();
    }
}
