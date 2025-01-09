import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private List<Book> booksList = new ArrayList<>();

    public void addBook(Book book)
    {
        booksList.add(book);
    }

    public void viewBooks()
    {
        if (booksList.isEmpty())
        {
            System.out.println("No books in the library.");
        }
        else
        {
            System.out.println("Available Books: ");
            for (Book book : booksList) {
                System.out.println("Book ID: "+ book.getId());
                System.out.println("Book Name: "+ book.getTitle());
                System.out.println("Author Name: "+ book.getAuthor());
                System.out.println();
            }
        }

    }

    public void searchBook(String bookTitle)
    {
        boolean found = true;
        for (Book book : booksList) {
            if (book.getTitle().equalsIgnoreCase(bookTitle))
            {
                found = false;
                System.out.println("Book found");
                System.out.println("Book ID: "+ book.getId());
                System.out.println("Book Name: "+ book.getTitle());
                System.out.println("Author Name: "+ book.getAuthor());
                break;
            }
        }
        if (found)
        {
            System.out.println("Book not found");
        }
    }
}
