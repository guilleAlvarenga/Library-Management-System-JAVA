package library_management_system;

import java.util.*;

/**
 * Represents a user of the library.
 * Users can borrow and return books, and their borrowed books are tracked.
 * 
 * @author Guille
 * @since 1.0
 */
public class User {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    /**
     * Constructs a new User instance.
     * 
     * @param name The name of the user.
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the user.
     * 
     * @return The user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the list of books currently borrowed by the user.
     * 
     * @return A list of borrowed books.
     */
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * Borrows a book for the user, marking the book as issued.
     * 
     * @param book The book to borrow.
     */
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.issueBook();
    }

    /**
     * Returns a borrowed book, marking it as available.
     * 
     * @param book The book to return.
     */
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }
}
