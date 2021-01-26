import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library( int capacity){
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getNumberOfBooksInCollection(){
        return bookCollection.size();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String addBookToCollection(Book book) {
        int collectionTotal = getNumberOfBooksInCollection();
        if (collectionTotal < getCapacity()) {
            bookCollection.add(book);
        }
        return "Library collection is full";
    }

    public boolean checkHasBookInCollection(Book book) {
        return bookCollection.contains(book);
    }

    public void removeBookFromCollection(Book book) {
        bookCollection.remove(book);
    }
}
