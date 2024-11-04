
package library_management_system;

import java.util.List;
import java.util.Scanner;

 public class AdminP {
    private  Scanner sc = new Scanner(System.in);
    private  Library library = new Library();
    
    public AdminP(Library library){
        this.library = library;
    }

    public void addBook(){
        System.out.println("Enter book title: ");
        String title = sc.nextLine();
        System.out.println("Enter book author: ");
        String author = sc.nextLine();
        Book book = new Book(title,author);
        library.addBook(book);
        System.out.println("Book added successfully.");
        
    }
    
    public void deleteBook(){
        System.out.println("Enter book title to delete: ");
        String title = sc.nextLine();
        List<Book> foundBooks = library.searchBook(title);
        
        if(foundBooks.isEmpty()){
            System.out.println("Book not found");
            return;
        }
        library.deleteBook(foundBooks.get(0));
        System.out.println("Book deleted successfully");
    }
    
    
}
