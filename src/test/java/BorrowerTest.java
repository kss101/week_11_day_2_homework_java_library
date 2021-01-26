import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book1, book2, book3;

    @Before
    public void before(){
        borrower = new Borrower("Kurt");
        book1 = new Book("Anarch", "Dan Abnett", "Science Fiction");
        book2 = new Book("13th Legion", "Guy Thorpe", "Science Fiction");
        book3 = new Book("Necronomicon", "H. P. Lovecraft", "Horror");
    }
    @Test
    public void checkCollectionStartsEmpty(){
        assertEquals(0, this.borrower.getNumberOfBorrowedBooksInCollection());
    }
}
