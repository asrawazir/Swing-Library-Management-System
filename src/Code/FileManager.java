package Code;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    ArrayListsManager alm =ArrayListsManager.instance;
    final String BOOKS_DATA_FILE = "Books.txt";
    final String ISSUED_BOOKS_DATA_FILE = "IssuedBooks.ser";

    public void loadDataFromFile(){
        try {
            File booksFile = new File(BOOKS_DATA_FILE);
            if (booksFile.exists()){
                Scanner sc = new Scanner(booksFile);
                while (sc.hasNextLine()){
                    String bookData = sc.nextLine();
                    String[] parts = bookData.split(",");

                    int quantity = Integer.parseInt(parts[3]);
                    int availableQuantity = Integer.parseInt(parts[4]);
                    Book b = new Book(parts[0], parts[1], parts[2], quantity,availableQuantity);

                    alm.addBook(b);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveBooksDataToFile(){
        try (PrintWriter pw = new PrintWriter(new FileWriter(BOOKS_DATA_FILE))) {
            ArrayList<Book> books = alm.getBooksList();
            for (int i = 0; i < books.size(); i++) {
                pw.println(
                        books.get(i).getID()+","+
                                books.get(i).getTitle()+","+
                                books.get(i).getAuthor()+","+
                                books.get(i).getTotalQuantity()+","+
                                books.get(i).getAvailableQuantity());
            }
        } catch (Exception e2) {
            System.out.println("Error saving books data.");
        }
    }
}
