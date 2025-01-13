public class LibraryManagement
{
    private final Adder bookAdder;
    private final Viewer bookViewer;
    private final Searcher bookSearcher;

    public LibraryManagement(Adder bookAdder, Viewer bookViewer, Searcher bookSearcher) {
        this.bookAdder = bookAdder;
        this.bookViewer = bookViewer;
        this.bookSearcher = bookSearcher;
    }

    public void addBook(Book book) {
        bookAdder.addBook(book);
    }

    public void viewBooks() {
        bookViewer.viewBooks();
    }

    public void searchBook(String title) {
        bookSearcher.searchBook(title);
    }
}