package Code;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    ArrayListsManager alm =ArrayListsManager.instance;
    final String BOOKS_DATA_FILE = "Books.txt";

    public void loadDataFromFile(){
        try {
            File booksFile = new File(BOOKS_DATA_FILE);
            if (booksFile.exists()){
                Scanner sc = new Scanner(booksFile);
                while (sc.hasNextLine()){
                    String bookData = sc.nextLine();
                    String[] parts = bookData.split(",");
                    Book b = new Book(parts[0],parts[1],parts[2],parts[3]);
                    alm.addBook(b);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
