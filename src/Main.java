import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        Validator bookValidator = new BookValidator(books);

        Adder bookAdder = new BookAdder(bookValidator, books);
        Viewer bookViewer = new BookViewer(books);
        Searcher bookSearcher = new BookSearcher(books);

        LibraryManagement manager = new LibraryManagement(bookAdder, bookViewer, bookSearcher);

        while (true) {
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
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}