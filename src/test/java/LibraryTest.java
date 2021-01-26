import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1, book2, book3, book4;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Anarch", "Dan Abnett", "Science Fiction");
        book2 = new Book("War Storm", "Nick Kyme", "Fantasy");
        book3 = new Book("Necronomicon", "H. P. Lovecraft", "Horror");
        book4 = new Book("The War Master", "Dan Abnett", "Science Fiction");
    }

    @Test
    public void checkCollectionStartsEmpty(){
        assertEquals(0, this.library.getNumberOfBooksInCollection());
    }

    @Test
    public void checkCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBookToCollection(book1);
        assertEquals(1, this.library.getNumberOfBooksInCollection());
    }

    @Test
    public void cantAddBookToCollection(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        assertEquals("Library collection is full", this.library.addBookToCollection(book3));
    }

    @Test
    public void checkAddBookGenreToGenreCheck(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        library.addBookToCollection(book4);
        library.addBookGenreToGenreCheck();

    }

}
