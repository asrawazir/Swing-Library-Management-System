package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    static ArrayList<Book> books;
    ArrayList<Member> members;

    public ArrayListsManager(){

        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
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
}
