package day11;

import java.util.Scanner;

class Book {
    String bookId;
    String title;
    String author;
    boolean issued = false;

    // Read Book Details
    void readData(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextLine();

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }

    // Issue Book
    void issueBook() {
        if (issued) {
            System.out.println("Book is already issued.");
        } else {
            issued = true;
            System.out.println("Book issued successfully.");
        }
    }

    // Return Book
    void returnBook() {
        if (!issued) {
            System.out.println("Book is already available.");
        } else {
            issued = false;
            System.out.println("Book returned successfully.");
        }
    }

    // Display Book Details
    void displayBook() {
        System.out.println("\nBOOK DETAILS");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);

        if (issued)
            System.out.println("Book Status : Issued");
        else
            System.out.println("Book Status : Available");
    }
}

public class LibraryBookStatus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        Book b2 = new Book();

        // Book 1
        System.out.println("Enter Details of Book 1");
        b1.readData(sc);

        // Book 2
        System.out.println("\nEnter Details of Book 2");
        b2.readData(sc);

        // Operations on Book 1
        System.out.println("\n--- Book 1 Operations ---");

        b1.issueBook();
        b1.displayBook();

        b1.issueBook();      // Invalid operation

        b1.returnBook();
        b1.displayBook();

        b1.returnBook();     // Invalid operation

        // Display Book 2
        System.out.println("\n--- Book 2 Details ---");
        b2.displayBook();

        sc.close();
    }
}