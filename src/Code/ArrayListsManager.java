package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    static ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<StudyRoom> rooms;

    public ArrayListsManager(){

        books = new ArrayList<>();
        members = new ArrayList<>();
        rooms.add(new StudyRoom("101"));
        rooms.add(new StudyRoom("102"));
        rooms.add(new StudyRoom("103"));
        rooms.add(new StudyRoom("104"));
        rooms.add(new StudyRoom("105"));
        rooms.add(new StudyRoom("106"));
        rooms.add(new StudyRoom("107"));
        rooms.add(new StudyRoom("108"));
        rooms.add(new StudyRoom("109"));
        rooms.add(new StudyRoom("110"));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooksList(){
        return books;
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public ArrayList<Member> getMembersList(){
        return members;
    }

    public ArrayList<StudyRoom> getRooms() {
        return rooms;
    }
}
