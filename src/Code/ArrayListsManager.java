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

    public String checkReservationStatus(String roomNumber,String memberID) {
        StudyRoom room = findRoom(roomNumber);
        Member member=findMemberById(memberID);
        if (room == null) {
            return "Room does not exist ";
        }

    }




    public void issueBook(IssuedBook issuedBook) {
    }
}