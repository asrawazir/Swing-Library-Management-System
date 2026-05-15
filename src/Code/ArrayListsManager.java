package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    static ArrayList<Book> books;
    ArrayList<IssuedBook> issuedBooks;
    ArrayList<Member> members;
    ArrayList<StudyRoom> rooms;

    public ArrayListsManager(){

        books = new ArrayList<>();
        issuedBooks = new ArrayList<>();
        members = new ArrayList<>();
        rooms=new ArrayList<>();
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

    public ArrayList<IssuedBook> getIssuedBooksList(){
        return issuedBooks;
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

    public StudyRoom findRoom(String roomNumber)
    {
        for(StudyRoom r:rooms ){
            if(r.getRoomNumber().equals(roomNumber)){
                return r;
            }
        }
        return null;
    }
    public Member findMemberById(String id){
        for(Member m : members){
            if(m.getId().equals(id)){
                return m;
            }
        }
        return null;
    }

    public String cancelReservation(String roomNumber, String memberID) {

        StudyRoom room=findRoom(roomNumber);
        Member member=findMemberById(memberID);
        if(room==null){
            return "Room does not exist";
        }
        if(member==null){
            return "Member does not exist";
        }
        if(!room.getIsReserved()){
         return "Room is not reserved";

        }

        if(room.getReservedByMemberID()==null || ! room.getReservedByMemberID().equals(memberID)){
            return " This member did not reserve this room ";
        }
         room.cancelReservation();
        return "Reservation cancelled successfully";
    }

    public String reserveRoom(String roomNumber, String memberID) {
        StudyRoom room = findRoom(roomNumber);
        Member member=findMemberById(memberID);
        if (room == null) {
            return "Room does not exist ";
        }
        if(member==null){
            return "Member does not exist";
        }
        if (room.getIsReserved()) {
            return "Room is already reserved";

        }
        if(room.getIsReserved()){
            return " This room is already reserved ";
        }
        room.reserveRoom(memberID);
        return "Room is reserved";
    }

    public String checkReservationStatus(String roomNumber) {
        StudyRoom room = findRoom(roomNumber);

        if (room == null) {
            return "Room does not exist ";
        }
        
        if (room.getIsReserved()) {
            return "Room is already reserved";

        }

            return "Room is not reserved";

    }


    public IssuedBook findIssueBook(String bookId, String memberId, String date){
        ArrayListsManager alm = ArrayListsManager.instance;
        ArrayList<Book> books = alm.getBooksList();
        ArrayList<Member> members = alm.getMembersList();
        Book book = null;
        Member member = null;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getID().equalsIgnoreCase(bookId)){
                book = books.get(i);
            }
        }
        for (int i = 0; i < members.size();i++){
            if (members.get(i).getId().equalsIgnoreCase(memberId)){
                member = members.get(i);
            }
        }
        if (book!= null && member!= null){
            return new IssuedBook(book,member,date);
        }
        return null;
    }

    public Book findBookById(String id){

        for(Book b : books){

            if(b.getID().equalsIgnoreCase(id)){
                return b;
            }
        }

        return null;
    }

    public String issueBookToMember(String bookId, String memberId, String date){

        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if(book == null)
        {
            return "Book does not exist";
        }

        if(member == null)
        {
            return "Member does not exist";
        }

        if(book.getAvailableQuantity() <= 0)
        {
            return "Book is out of stock";
        }

        boolean reduced = book.subtractAvailableQuantity();

        if(!reduced)
        {
            return "Book is out of stock";
        }

        IssuedBook issuedBook = new IssuedBook(book, member, date);

        issuedBooks.add(issuedBook);

        return "Book issued successfully";
    }

    public IssuedBook findIssuedBookRecord(String bookId, String memberId){
        for(IssuedBook ib : issuedBooks){
            if(
                    ib.getBook().getID().equalsIgnoreCase(bookId)
                            &&
                            ib.getMember().getId().equalsIgnoreCase(memberId)
            )
            {
                return ib;
            }
        }
        return null;
    }

    public String returnBook(String bookId, String memberId){
        Book book = findBookById(bookId);
        if(book == null)
        {
            return "Book does not exist";
        }
        Member member = findMemberById(memberId);
        if(member == null)
        {
            return "Member does not exist";
        }
        IssuedBook issuedBook = findIssuedBookRecord(bookId, memberId);
        if(issuedBook == null)
        {
            return "This member did not issue this book";
        }
        boolean added = book.addAvailableQuantity();
        if(!added)
        {
            return "Book quantity exceeds total inventory";
        }
        issuedBooks.remove(issuedBook);
        return "Book returned successfully";
    }

    public void issueBook(String id){
        ArrayListsManager alm = ArrayListsManager.instance;
        ArrayList<Book> books = alm.getBooksList();
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getID().equals(id)){
                books.get(i).subtractAvailableQuantity();
            }
        }
    }
    public void addIssuedBook(IssuedBook issuedBook){
        issuedBooks.add(issuedBook);
    }

    public String registerNewMember(String id, String name, String phone, String email){

        if (id.trim().isEmpty() || name.trim().isEmpty() ||
                phone.trim().isEmpty() || email.trim().isEmpty()) {
            return "All fields are required for registration";
        }

        if (findMemberById(id) != null) {
            return "Member ID already exists";

        }

        members.add(new Member(id,name,phone,email));
        new FileManager().saveMembersToFile();
        return "Member registered successfully";
    }

    public Member searchMemberById(String id) {
        return findMemberById(id);
    }

    public Member searchMemberByName(String name) {
        for (Member m : members) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<IssuedBook> viewBooksByMemberId(String memberID) {
        ArrayList<IssuedBook> result = new ArrayList<>();

        if (this.issuedBooks == null) return result;

        for (IssuedBook ib : this.issuedBooks) {
            if (ib == null || ib.getMember() == null || ib.getBook() == null) {
                continue;
            }

            if (ib.getMember().getId().trim().equalsIgnoreCase(memberID)) {
                result.add(ib);
            }
        }
        return result;
    }

    public String removeMember(String memberID){

        Member member = findMemberById(memberID);

        if(member == null){

            return "Member does not exist";
        }

        members.remove(member);

        new FileManager().saveMembersToFile();

        return "Member removed successfully";
    }
}