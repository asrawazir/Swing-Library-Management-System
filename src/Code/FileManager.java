package Code;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private final ArrayListsManager alm = ArrayListsManager.instance;

    private final String booksFile = "books.ser";
    private final String issuedFile = "issuedbooks.ser";

    public void loadDataFromFile() {
        loadBooks();
        loadIssuedBooks();
    }

    private void loadBooks() {

        File file = new File(booksFile);
        if (!file.exists())
        {
            return;
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<Book> books = (ArrayList<Book>) in.readObject();
            alm.getBooksList().clear();
            alm.getBooksList().addAll(books);
        }
        catch (Exception e) {
            System.out.println("Books load error");
        }
    }

    public void saveBooksDataToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(booksFile)))
        {
            out.writeObject(alm.getBooksList());
        }
        catch (Exception e)
        {
            System.out.println("Books save error");
        }
    }

    private void loadIssuedBooks()
    {
        File file = new File(issuedFile);
        if (!file.exists())
        {
            return;
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
        {
            ArrayList<IssuedBook> issued = (ArrayList<IssuedBook>) in.readObject();
            alm.getIssuedBooksList().clear();
            alm.getIssuedBooksList().addAll(issued);

        }
        catch (Exception e)
        {
            System.out.println("Issued books load error");
        }
    }

    public void saveIssuedBooksDataToFile()
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(issuedFile)))
        {
            out.writeObject(alm.getIssuedBooksList());
        }
        catch (Exception e)
        {
            System.out.println("Issued books save error");
        }
    }
}
