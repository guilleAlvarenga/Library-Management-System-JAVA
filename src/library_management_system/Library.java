package library_management_system;

import java.util.*;

/**
 * Represents a library that manages a collection of books and users.
 * Provides methods to add, remove, and search for books, as well as to manage user borrowing.
 * 
 * @author Guille
 * @since 1.0
 */
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    /**
     * Adds a book to the library collection.
     * 
     * @param book The book to be added to the library.
     */
    public void addBook(Book book) {
        books.add(book);
        displayBooks();
    }

    /**
     * Removes a book from the library collection.
     * 
     * @param book The book to be removed.
     */
    public void deleteBook(Book book) {
        books.remove(book);
    }

    /**
     * Adds a user to the library system.
     * 
     * @param user The user to be added.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Removes a user from the library system.
     * 
     * @param user The user to be removed.
     */
    public void deleteUser(User user) {
        users.remove(user);
    }

    /**
     * Gets a list of available books in the library (books that have not been issued).
     * 
     * @return A list of available books.
     */
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isIssued()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    /**
     * Searches for books by title in the library collection.
     * 
     * @param title The title of the book to search for.
     * @return A list of books with matching titles.
     */
    public List<Book> searchBook(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Displays all users and the books they have borrowed.
     */
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }
        for (User user : users) {
            System.out.println("User: " + user.getName());
            if (user.getBorrowedBooks().isEmpty()) {
                System.out.println("No borrowed books.");
            } else {
                for (Book book : user.getBorrowedBooks()) {
                    System.out.println("  Borrowed Book: " + book.getTitle());
                }
            }
        }
    }

    /**
     * Displays all books in the library, indicating their availability.
     */
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
