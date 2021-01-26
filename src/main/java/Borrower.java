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
}
