import java.util.*;
interface Validator {
    Book findBookByTitle(String title);

    Book findBookById(int id);
}

class BookValidator implements Validator {
    private List<Book> booksList;

    BookValidator(List<Book> books)
    {
        booksList = books;
    }
    @Override
    public Book findBookByTitle(String title)
    {
        for (Book book : booksList)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findBookById(int id)
    {
        for (Book book : booksList)
        {
            if (book.getId() == id)
            {
                return book;
            }
        }
        return null;
    }
}