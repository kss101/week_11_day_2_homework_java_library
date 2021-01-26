import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1, book2, book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Anarch", "Dan Abnett", "Science Fiction");
        book2 = new Book("13th Legion", "Guy Thorpe", "Science Fiction");
        book3 = new Book("Necronomicon", "H. P. Lovecraft", "Horror");
    }

    @Test
    public void checkCollectionStartsEmpty(){
        assertEquals(0, this.library.getNumberOfBooksInCollection());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBookToCollection(book1);
        assertEquals(1, this.library.getNumberOfBooksInCollection());
    }

}
