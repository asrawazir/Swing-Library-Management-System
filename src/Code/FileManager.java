package Code;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private final ArrayListsManager alm = ArrayListsManager.instance;

    private final String booksFile = "books.ser";
    private final String issuedFile = "issuedbooks.ser";
    private final String MEMBERS_FILE = "members.ser";
    private final String ROOM_FILE="rooms.ser";
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

    public void saveMembersToFile(){
        try{
            ObjectOutputStream mos = new ObjectOutputStream(new FileOutputStream(MEMBERS_FILE));

            mos.writeObject(alm.getMembersList());

            System.out.println("Members saved successfully to file.");
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void loadMembersFromFile(){

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MEMBERS_FILE));

            alm.members = (ArrayList<Member>) ois.readObject();

            System.out.println("Members loaded successfully");

        } catch (FileNotFoundException e) {

            System.out.println("No previous file found");

        } catch (IOException e) {

            System.out.println("Error reading file");

            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");

            e.printStackTrace();
        }
    }

    public void saveRooms(ArrayList<StudyRoom>rooms){
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(ROOM_FILE));
            oos.writeObject(rooms);
            oos.close();

        } catch (Exception e) {
            System.out.println("Exception : " + e.toString());
        }
    }

    public ArrayList<StudyRoom> loadRooms() {
        ArrayList<StudyRoom> rooms = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ROOM_FILE));
            rooms = (ArrayList<StudyRoom>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return rooms;

    }

}
