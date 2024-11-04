package library_management_system;

/**
 * The main application class that runs the library management system.
 * It creates instances of Library, Book, and User, and performs various operations such as adding books and borrowing books.
 * 
 * @author Guille
 * @since 1.0
 */
public class LibraryManagementApp {

    /**
     * The entry point of the library management application.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Moby Dick", "Herman Melville");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Adding users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        library.addUser(user1);
        library.addUser(user2);
        
        //Displaying menu
        LMS_Menu menu = new LMS_Menu(library);

    }
}
