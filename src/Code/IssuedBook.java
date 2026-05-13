package Code;

import java.util.ArrayList;

public class IssuedBook {
    //attributes
    private Book book;
    private Member member;
    private String issueDate;

    //default constructor
    public IssuedBook(){
        this.book = new Book();
        this.member = new Member();
        this.issueDate = "not specified";
    }

    //parameterized constructor
    public IssuedBook(Book book, Member member, String date)
    {
        this.book = book;
        this.member = member;
        this.issueDate = date;
    }

    //Getter methods
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public String getDate() {
        return issueDate;
    }
}
