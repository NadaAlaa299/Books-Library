import java.util.*;
interface Searcher {
    void searchBook(String title);
}

class BookSearcher implements Searcher {
    private final List<Book> books;

    public BookSearcher(List<Book> books) {
        this.books = books;
    }

    @Override
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                found = true;
                System.out.println("Book found");
                System.out.println("Book ID: " + book.getId());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Author Name: " + book.getAuthor());
                break;
            }
        }
        if (!found)
        {
            System.out.println("Book not found");
        }
    }
}