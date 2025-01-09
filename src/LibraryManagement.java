import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book)
    {
        bookList.add(book);
    }

    public void viewBook()
    {
        System.out.println("Available Books: ");
        for (Book book : bookList) {
            System.out.println("Book ID: "+ book.getId());
            System.out.println("Book Name: "+ book.getTitle());
            System.out.println("Author Name: "+ book.getAuthor());
            System.out.println();
        }
    }

    public void searchBook(String bookTitle)
    {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(bookTitle))
            {
                System.out.println("Book ID: "+ book.getId());
                System.out.println("Book Name: "+ book.getTitle());
                System.out.println("Author Name: "+ book.getAuthor());
                break;
            }
        }
    }
}
