package Code;

public class Book {
    private String id;
    private String title;
    private String author;
    private int totalQuantity;
    private int availableQuantity;

    public Book() {
        this.id = "0";
        this.title = "Not assigned";
        this.author = "Unknown";
        this.totalQuantity = 0;
        this.availableQuantity = 0;
    }

    public Book(String id, String title, String author, int qty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
    }

    public Book(String id, String title, String author, int totalQuantity, int availableQuantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = availableQuantity;
    }

    public String getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public boolean addAvailableQuantity()
    {
        if(availableQuantity >= totalQuantity){
            availableQuantity = totalQuantity;
            return false;
        }
        availableQuantity++;
        return true;
    }

    public boolean subtractAvailableQuantity() {
        if (availableQuantity <= 0)
        {
            return false;
        }

        availableQuantity--;
        return true;
    }

}
