package Tugas;

public class Book {
    public static final double DISCOUNT_RATE = 0.1;
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayInfo(){
        System.out.println("Title: " +getTitle());
        System.out.println("Author: " +getAuthor());
        System.out.println("Price: " +getPrice());
        System.out.println("Discounted Price $" + calculateDiscount());
        System.out.println("Stock: " +getStock());
    }

    private double calculateDiscount() {
        return getPrice() - (getPrice() * DISCOUNT_RATE);
    }


    public void adjustStock(int adjusment){
        stock += adjusment;
        System.out.println("Stock adjusted.");
        System.out.println("Current stock " +getStock());
    }

    public void showLibraryInfo(Library library){
        System.out.println("Library Location: " + library.location);
        displayInfo();
    }
}
