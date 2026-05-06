package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    static ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<IssuedBook> issuedBooks;

    public ArrayListsManager(){

        books = new ArrayList<>();
        members = new ArrayList<>();
        issuedBooks = new ArrayList<>();
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

    public void issueBook(IssuedBook issuedBook){
        issuedBooks.add(issuedBook);
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public ArrayList<Member> getMembersList(){
        return members;
    }
}
