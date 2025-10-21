package Tugas;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Harry Porter", "J.K Rowling", 10,2);
        Library lib = new Library(book1, "Perpustakaan kota");

        lib.book.showLibraryInfo(lib);
        book1.adjustStock(5);
        lib.book.showLibraryInfo(lib);
    }
}
