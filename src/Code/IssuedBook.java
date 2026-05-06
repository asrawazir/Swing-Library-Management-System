package Code;

import java.util.ArrayList;

public class IssuedBook {
    private Book book;
    private Member member;
    private String issueDate;

    public IssuedBook(){
        this.book = new Book();
        this.member = new Member();
        this.issueDate = "not specified";
    }

    public IssuedBook(Book book, Member member, String date)
    {
        this.book = book;
        this.member = member;
        this.issueDate = date;
    }

    public IssuedBook issueBook(String bookId,String memberId, String date){
        ArrayListsManager alm = ArrayListsManager.instance;
        ArrayList<Book> books = alm.getBooksList();
        ArrayList<Member> members = alm.getMembersList();
        Book book = null;
        Member member = null;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getID().equalsIgnoreCase(bookId)){
                book = books.get(i);
            }
            else {
                return null;
            }
        }

        for (int i = 0; i < members.size();i++){
            if (members.get(i).getId().equalsIgnoreCase(memberId)){
                member = members.get(i);
            }
            else {
                return null;
            }
        }

        if (book!= null && member!= null){
            return new IssuedBook(book,member,date);
        }
        return null;
    }
}
