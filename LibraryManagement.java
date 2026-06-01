import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    int bookId;
}

public class LibraryManagement {

    static void addBook(Scanner sc, ArrayList<Book> books) {
        Book b = new Book();

        System.out.println("Enter book title: ");
        sc.nextLine();
        b.title = sc.nextLine();

        System.out.println("Enter book author: ");
        b.author = sc.nextLine();

        System.out.println("Enter book ID: ");
        b.bookId = sc.nextInt();

        books.add(b);

        System.out.println("Book added successfully!");
    }

    static void displayBooks(ArrayList<Book> books){
        if(books.isEmpty()){
            System.out.println("No books found.");
            return;
        }

        System.out.println("\nBook Details:");

        for(Book bk : books){
            System.out.println("----------------------");
            System.out.println("Title: "+ bk.title);
            System.out.println("Author: "+bk.author);
            System.out.println("Book ID: "+ bk.bookId);
        }
    }

    static void searchBook(Scanner sc, ArrayList<Book> books){
        System.out.println("Enter book ID to search: ");
        int searchBookId = sc.nextInt();

        boolean found = false;

        for (Book bk : books) {

            if (bk.bookId == searchBookId) {

                System.out.println("Book Found:");
                System.out.println("Title: " + bk.title);
                System.out.println("Author: " + bk.author);
                System.out.println("Book ID: " + bk.bookId);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
}

public static void main(String[] args){

    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    int choice;

    do {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Search Book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                addBook(sc, books);
                break;
            case 2:
                displayBooks(books);
                break;
            case 3:
                searchBook(sc, books);
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }while (choice != 4);
}
}