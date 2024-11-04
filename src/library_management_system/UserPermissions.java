
package library_management_system;

import java.util.List;
import java.util.Scanner;

public class UserPermissions{
    private  Scanner sc = new Scanner(System.in);
    private Library library = new Library();

    public UserPermissions(Library library){
        this.library = library;
    }
    protected void viewAvailableBooks(){
        List<Book> availableBooks = library.getAvailableBooks();
        if (availableBooks.isEmpty()) {
            System.out.println("No books available");
        }else{
            for(Book book : availableBooks){
                System.out.println(book);
            }
        }
    }
    
    protected void borrowBook(User user){
        System.out.println("Enter book title to borrow: ");
        String title = sc.nextLine();
        List<Book> foundBooks = library.searchBook(title);
        if (foundBooks.isEmpty() || foundBooks.get(0).isIssued()) {
            System.out.println("Book is not available.");
        }else{
            user.borrowBook(foundBooks.get(0));
            System.out.println("Book borrowed successfully.");
        }
    }
    
    protected void returnBook(User user){
        System.out.println("Enter book title to return: ");
        String title = sc.nextLine();
        List<Book> foundBooks = library.searchBook(title);
        if (foundBooks.isEmpty()) {
            System.out.println("Book not found.");
        }else{
            user.returnBook(foundBooks.get(0));
            System.out.println("Book returned successfully.");
        }
    }
    protected void searchBook(){
        System.out.println("Enter book title to search: ");
        String title = sc.nextLine();
        List<Book> foundBooks = library.searchBook(title);
        if (foundBooks.isEmpty()) {
            System.out.println("Book not found.");
        }else{
            for(Book book : foundBooks){
                System.out.println(book);
            }
        }
    }
    
}
