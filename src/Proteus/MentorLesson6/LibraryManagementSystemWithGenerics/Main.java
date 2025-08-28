package Proteus.MentorLesson6.LibraryManagementSystemWithGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Aljir", "Ulviyya Tahir");
        Book book1 = new Book("NoTitle", "NoAuthor");
        Library library = new Library(new ArrayList<>());
        library.addBook(book);
        library.addBook(book1);

        library.printAllBooks();
    }
}
