
package library_management_system;
import java.util.Scanner;

public class LMS_Menu {
    private Scanner sc = new Scanner(System.in);
    private Library library;
    private AdminP adminP;
    private UserPermissions userMenu;
    
    public LMS_Menu(Library library) {
        this.library = library;
        adminP = new AdminP(library);
        userMenu = new UserPermissions(library);
         boolean running = true;
        
        while(running){
            System.out.println("Library Management System:");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.println("Select an option: ");
            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            
            switch(option){
                case 1 -> displayAdminMenu();
                case 2 -> displayUserMenu();
                case 3 -> running = false;
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
    }
    
  
    public void displayAdminMenu(){
        System.out.println("Admin Menu: ");
        boolean adminRunning = true;
        
        while(adminRunning){
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. View Users");
            System.out.println("4. View Books");
            System.out.println("5. Logout");
            System.out.println("Select an option");
            int option = sc.nextInt();
            
            switch(option){
                case 1 -> adminP.addBook();
                case 2 -> adminP.deleteBook();
                case 3 -> library.displayUsers();
                case 4 -> library.displayBooks();
                case 5 -> adminRunning = false;
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
    }
    
    public void displayUserMenu(){
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        User user = new User(name);
        library.addUser(user);
        boolean userRunning = true;
        
        while(userRunning){
            System.out.println("User Menu: ");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Logout");
            System.out.println("Select an option: ");
            int option = sc.nextInt();

            
            switch(option){
                case 1 -> userMenu.viewAvailableBooks();
                case 2 -> userMenu.borrowBook(user);
                case 3 -> userMenu.returnBook(user);
                case 4 -> userMenu.searchBook();
                case 5 -> userRunning = false;
                default -> System.out.println("Invalid option! PLease try again.");
            }
        }

    }
    
}
