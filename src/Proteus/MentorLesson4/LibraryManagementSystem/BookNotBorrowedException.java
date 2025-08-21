package Proteus.MentorLesson4.LibraryManagementSystem;

public class BookNotBorrowedException extends Exception{
    public BookNotBorrowedException(String message){
        super(message);
    }
}
