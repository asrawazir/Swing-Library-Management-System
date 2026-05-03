package Code;

public class Book {
    private int id;
    private String title;
    private String author;
    private int totalQuantity;
    private int availableQuantity;

    public Book() {
        this.id = 0;
        this.title = "Not assigned";
        this.author = "Unknown";
        this.totalQuantity = 0;
        this.availableQuantity = 0;
    }

    public Book(int id, String title, String author, int qty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
    }



    public int getID() {
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

}
