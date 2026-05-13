package Code;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    ArrayListsManager alm =ArrayListsManager.instance;
    ArrayList<Member> members = alm.getMembersList();
    final String BOOKS_DATA_FILE = "Books.txt";
    final String MEMBERS_DATA_FILE = "Members.txt";

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

    public void saveBooksDataToFile(){
        try (PrintWriter pw = new PrintWriter(new FileWriter(BOOKS_DATA_FILE))) {
            ArrayList<Book> books = alm.getBooksList();
            for (int i = 0; i < books.size(); i++) {
                pw.println(
                        books.get(i).getID()+","+
                                books.get(i).getTitle()+","+
                                books.get(i).getAuthor()+","+
                                books.get(i).getTotalQuantity());
            }
        } catch (Exception e2) {
            System.out.println("Error saving books data.");
        }

    }

    public void loadMembersFromFile(){
        try{
            ObjectOutputStream mos = new ObjectOutputStream(new FileOutputStream(MEMBERS_DATA_FILE));

            mos.writeObject(members);

            System.out.println("Members saved successfully to file.");
        }
        catch(IOException e){

        }
    }
}
