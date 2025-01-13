import java.util.*;
interface Adder {
    void addBook(Book book);
}

class BookAdder implements Adder {
    private final Validator bookValidator;
    private final List<Book> books;

    public BookAdder(Validator bookValidator, List<Book> books) {
        this.bookValidator = bookValidator;
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        if (bookValidator.findBookById(book.getId()) != null && bookValidator.findBookByTitle(book.getTitle()) != null) {
            System.out.println("Book with the same ID and Title already exists, Please try again.");
        }
        else if (bookValidator.findBookById(book.getId()) != null)
        {
            System.out.println("Book with the same ID already exists, Please try again and enter another ID.");
        }
        else if (bookValidator.findBookByTitle(book.getTitle()) != null) {
            System.out.println("Book with the same Title already exists, Please try again and enter another title.");
        }
        else
        {
            books.add(book);
            System.out.println("Book added successfully");
        }
    }
}