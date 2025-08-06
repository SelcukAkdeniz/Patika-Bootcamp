package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. List Books");
            System.out.println("2. Add New Book");
            System.out.println("3. Search Books by Title");
            System.out.println("4. Borrow a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.listBooks();
                    break;
                case "2":
                    library.addBook(scanner);
                    break;
                case "3":
                    library.searchBookByTitle(scanner);
                    break;
                case "4":
                    library.borrowBook(scanner);
                    break;
                case "5":
                    library.returnBook(scanner);
                    break;
                case "6":
                    System.out.println("Exiting the program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

        scanner.close();
    }
}
