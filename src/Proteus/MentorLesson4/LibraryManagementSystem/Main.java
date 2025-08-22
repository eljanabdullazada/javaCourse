package Proteus.MentorLesson4.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) throws BookAlreadyBorrowedException, BookNotBorrowedException {
        Library lib = new Library("C Building");

        Book [] books = {
                new Book("Secret", "Rhonda Byrne"),
                new Book("Atomic Habits", "James Clear"),
                new Book("Aljir", "Ulviyye Tahir"),
                new Book("Menim Payim", "Perinus Senii"),
                new Book("The Algorithm Design Manual", "Steven Skiena")
        };
        for (Book book : books) {
            lib.addBook(book);
        }

        System.out.println();
        lib.printAllBooks();

        System.out.println();
        try{
            lib.borrowBook("Secret");
        } catch (BookAlreadyBorrowedException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        lib.printAllBooks();
        System.out.println();

        try{
            lib.borrowBook("Secret");
        } catch (BookAlreadyBorrowedException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        lib.printAllBooks();
        System.out.println();

        try{
            lib.returnBook("Aljir");
        } catch (BookNotBorrowedException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        lib.printAllBooks();

    }
}
