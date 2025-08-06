package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
        addInitialBooks();
    }

    private void addInitialBooks() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "2345678901"));
        books.add(new Book("1984", "George Orwell", "3456789012"));
        books.add(new Book("Thinking in Java", "Bruce Eckel", "11100087654-1"));
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library.");
            return;
        }
        System.out.println("\n📚 Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Scanner scanner) {
        System.out.print("Book title: ");
        String title = scanner.nextLine();

        System.out.print("Author name: ");
        String author = scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        // Aynı ISBN'li kitap kontrolü
        for (Book b : books) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("A book with this ISBN already exists!");
                return;
            }
        }

        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully.");
    }

    public void searchBookByTitle(Scanner scanner) {
        System.out.print("Search book title: ");
        String search = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(search)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The book you were looking for was not found.");
        }
    }

    public void borrowBook(Scanner scanner) {
        System.out.print("ISBN of the book to be borrowed: ");
        String isbn = scanner.nextLine();

        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                if (book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                } else {
                    book.borrow();
                    System.out.println("The book was borrowed successfully.");
                }
                return;
            }
        }

        System.out.println("No books found matching this ISBN.");
    }

    public void returnBook(Scanner scanner) {
        System.out.print("ISBN of the book to be returned: ");
        String isbn = scanner.nextLine();

        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                if (!book.isBorrowed()) {
                    System.out.println("This book is already available in the library.");
                } else {
                    book.returnBook();
                    System.out.println("The book was returned successfully.");
                }
                return;
            }
        }

        System.out.println("No books found matching this ISBN.");
    }
}
