import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;
    private HashMap<String, Integer> genreCheck;

    public Library( int capacity){
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
        this.genreCheck = new HashMap();
    }

    /**
     * Get the current total number of books in the library's book collection ArrayList<>.
     */
    public int getNumberOfBooksInCollection(){
        return bookCollection.size();
    }

    public int getCapacity(){
        return this.capacity;
    }

    /**
     * Add a book object to the library collection ArrayList<>
     */
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

    public void addBookGenreToGenreCheck(){
        for(Book book : this.bookCollection) {
            String key = book.getGenre();
            genreCheck.putIfAbsent(key, 0);
            genreCheck.put(key, genreCheck.get(key) + 1);
        }
    }

    public HashMap<String, Integer> getBookGenreList(){
        return this.genreCheck;
    }
}
