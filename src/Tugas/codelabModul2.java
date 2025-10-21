package Tugas;

class dahlah{
    public String title;
    public String author;
    public double price;
    public int stock;

    dahlah(String title, String author, double price, int stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public void displayInfo(){
        System.out.println("Title : " +title);
        System.out.println("Author : " +author);
        System.out.println();
    }
}
public class codelabModul2 {
}
