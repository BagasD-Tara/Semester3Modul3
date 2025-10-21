package Tugas;

public class Library {
    public Book book;
    public String location;

    public Library(Book book, String location) {
        this.book = book;
        this.location = location;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
