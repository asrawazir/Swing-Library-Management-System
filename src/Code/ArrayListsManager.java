package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    static ArrayList<Book> books;
    public ArrayListsManager(){
         books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

}
