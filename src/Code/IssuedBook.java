package Code;

public class IssuedBook {
    private Book book;
    private Member member;
    private String issueDate;

    public IssuedBook(){
        this.book = new Book();
        this.member = new Member();
        this.issueDate = "not specified";
    }

}
