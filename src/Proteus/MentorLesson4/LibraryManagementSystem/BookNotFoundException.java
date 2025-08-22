package Proteus.MentorLesson4.LibraryManagementSystem;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String message){
        super(message);
    }
}
