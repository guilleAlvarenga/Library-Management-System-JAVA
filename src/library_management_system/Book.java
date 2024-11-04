package library_management_system;

/**
 * Represents a book in the library system.
 * Each book has a title, an author, and a status indicating if it has been issued.
 * 
 * @author Guille
 * @since 1.0
 */
public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    /**
     * Constructs a new Book instance.
     * 
     * @param title  The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    /**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Checks whether the book is currently issued.
     * 
     * @return true if the book is issued, false otherwise.
     */
    public boolean isIssued() {
        return isIssued;
    }

    /**
     * Marks the book as issued.
     */
    public void issueBook() {
        this.isIssued = true;
    }

    /**
     * Marks the book as returned and available for borrowing.
     */
    public void returnBook() {
        this.isIssued = false;
    }

    /**
     * Returns a string representation of the book, including its title, author, and issue status.
     * 
     * @return A string describing the book.
     */
    @Override
    public String toString() {
        return "Book title: " + title + ", Author: " + author + (isIssued ? " (Issued)" : " (Available)");
    }
}
