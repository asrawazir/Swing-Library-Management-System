package Code;

public class StudyRoom {
    //Attributes
    private String roomNumber;
    private boolean isReserved;
    private String reservedByMemberID;

    //Default Constructor
    public StudyRoom()
    {
        roomNumber="null";
        isReserved=false;
        reservedByMemberID=null;
    }
    public StudyRoom(String roomNumber)
    {
        this.roomNumber=roomNumber;
        this.isReserved=false;
        this.reservedByMemberID=null;

    }

    //Parameterized constructor
    public StudyRoom(String roomNumber ,String reservedByMemberID)
    {
        this.roomNumber=roomNumber;
        this.isReserved=false;
        this.reservedByMemberID=reservedByMemberID;

    }
    //Parameterized constructor
    public StudyRoom(String roomNumber,boolean isReserved,String reservedByMemberID)
    {
        this.roomNumber=roomNumber;
        this.isReserved=isReserved;
        this.reservedByMemberID=reservedByMemberID;
    }

    // room reservation method
    public void reserveRoom(String memberID)
    {
        if(!isReserved)
        {
            isReserved=true;
            reservedByMemberID=memberID;
            System.out.println("Room is reserved");
        }
        else
        {
            System.out.println("Room is already reserved");
        }
    }

    //cancel reservation method
    public void cancelReservation()
    {
        if(isReserved)
        {
            isReserved=false;
            reservedByMemberID=null;
            System.out.println("Reservation of room is cancelled");
        }
        else
        {
            System.out.println("Room is not reserved");
        }
    }

    // displaying all room status
    public void displayRoomStatus()
    {
        System.out.printf("%-10d %-12s %-15s \n", roomNumber,
                (isReserved ? "Reserved" : "Available"),(isReserved ? reservedByMemberID : "-" ));
    }

    //Getter Methods


    public String getRoomNumber()
    {
        return roomNumber;
    }

    public String getReservedByMemberID()
    {
        return reservedByMemberID;
    }


    public boolean getIsReserved() {
        return isReserved;
    }
}
