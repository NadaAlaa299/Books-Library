import java.util.*;
interface Viewer {
    void viewBooks();
}

class BookViewer implements Viewer
{
    private final List<Book> books;

    public BookViewer(List<Book> books)
    {
        this.books = books;
    }

    @Override
    public void viewBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("No books in the library.");
        }
        else
        {
            System.out.println("Available Books: ");
            for (Book book : books) {
                System.out.println("Book ID: " + book.getId());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Author Name: " + book.getAuthor());
                System.out.println();
            }
        }
    }
}