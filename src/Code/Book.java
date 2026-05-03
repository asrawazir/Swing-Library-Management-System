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
}
