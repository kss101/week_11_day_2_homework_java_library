import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book1, book2, book3;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Kurt");
        book1 = new Book("Anarch", "Dan Abnett", "Science Fiction");
        book2 = new Book("13th Legion", "Guy Thorpe", "Science Fiction");
        book3 = new Book("Necronomicon", "H. P. Lovecraft", "Horror");
        library = new Library(2);
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
    }
    @Test
    public void checkCollectionStartsEmpty(){
        assertEquals(0, this.borrower.getNumberOfBorrowedBooksInCollection());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowsBookFromLibrary(library, book1);
        assertEquals(1, this.borrower.getNumberOfBorrowedBooksInCollection());
    }

    @Test
    public void cantBorrowBook(){
        assertEquals("Book is already booked out!", this.borrower.borrowsBookFromLibrary(library, book3));
    }
}
