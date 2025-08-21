package Proteus.MentorLesson4.LibraryManagementSystem;

public class BookAlreadyBorrowedException extends Exception{
    public BookAlreadyBorrowedException(String message){
        super(message);
    }
}
