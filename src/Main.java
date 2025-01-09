import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagement manager = new LibraryManagement();

        while (true)
        {
            System.out.println("\n< Library Management System >");
            System.out.println("1) Add Book");
            System.out.println("2) View Books");
            System.out.println("3) Search Book by Title");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Book Title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.print("Enter Author Name: ");
                        String author = scanner.nextLine();

                        Book book = new Book(id, bookTitle, author);
                        manager.addBook(book);
                        System.out.println("Book added successfully");
                        break;
                    case 2:
                        manager.viewBooks();
                        break;
                    case 3:
                        System.out.print("Enter Book Title: ");
                        bookTitle = scanner.nextLine();
                        manager.searchBook(bookTitle);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e)
            {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}