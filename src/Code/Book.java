package Code;

public class Book {
    private String id;
    private String title;
    private String author;
    private String totalQuantity;
    private String availableQuantity;

    public Book() {
        this.id = "0";
        this.title = "Not assigned";
        this.author = "Unknown";
        this.totalQuantity = "0";
        this.availableQuantity = "0";
    }

    public Book(String id, String title, String author, String qty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
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

    public String getTotalQuantity() {
        return totalQuantity;
    }

    public String getAvailableQuantity() {
        return availableQuantity;
    }

}
