package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

}
