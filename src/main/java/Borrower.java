import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedCollection;

    public Borrower(String name){
        this.name = name;
        this.borrowedCollection = new ArrayList<>();
    }

    public int getNumberOfBorrowedBooksInCollection() {
        return borrowedCollection.size();
    }

    public void borrowsBookFromLibrary(Library library, Book book){
        boolean libraryHasBook = library.checkHasBookInCollection(book);
        if (libraryHasBook == true){
            library.removeBookFromCollection(book);
            this.borrowedCollection.add(book);
        }
    }
}
