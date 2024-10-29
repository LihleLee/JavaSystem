import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Lists to store Account and Book objects
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        // Scanner to handle user input
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Main loop to keep the program running until the user chooses to exit
        while (running) {
            // Display menu options to the user
            System.out.println("\nOptions:");
            System.out.println("1. Create Student Account");
            System.out.println("2. Create Admin Account");
            System.out.println("3. Add Book");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Display All Books"); // Option to display all books
            System.out.println("6. Exit");

            // Prompt the user for their choice
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            // Switch case to handle different menu options based on user input
            switch (choice) {
                case "1":
                    createStudentAccount(scanner); // Call method to create a Student Account
                    break;
                case "2":
                    createAdminAccount(scanner); // Call method to create an Admin Account
                    break;
                case "3":
                    addBook(scanner); // Call method to add a Book
                    break;
                case "4":
                    displayAllAccounts(); // Call method to display all accounts
                    break;
                case "5":
                    displayAllBooks(); // Call method to display all books
                    break;
                case "6":
                    running = false; // Exit the program
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        // Close the scanner resource to avoid memory leaks
        scanner.close();
    }

    // Method to create a Student Account with user input
    private static void createStudentAccount(Scanner scanner) {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter student ID (integer): ");
            int studentID = Integer.parseInt(scanner.nextLine()); // Parse input as an integer

            // Add new StudentAccount object to accounts list
            accounts.add(new StudentAccount(username, password, studentID));
            System.out.println("Student account created successfully.");
        } catch (NumberFormatException e) {
            // Handle invalid input for student ID
            System.out.println("Invalid input! Student ID should be an integer.");
        }
    }

    // Method to create an Admin Account with user input
    private static void createAdminAccount(Scanner scanner) {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter admin level (integer): ");
            int adminLevel = Integer.parseInt(scanner.nextLine()); // Parse input as an integer

            // Add new AdminAccount object to accounts list
            accounts.add(new AdminAccount(username, password, adminLevel));
            System.out.println("Admin account created successfully.");
        } catch (NumberFormatException e) {
            // Handle invalid input for admin level
            System.out.println("Invalid input! Admin level should be an integer.");
        }
    }

    // Method to add a Book with user input
    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Add new Book object to books list
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully.");
    }

    // Method to display all Account objects
    private static void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            // Loop through each account and call displayRole() method
            for (Account account : accounts) {
                account.displayRole();
            }
        }
    }

    // Method to display all Book objects
    private static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            // Loop through each book and call displayInfo() method
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }
}
