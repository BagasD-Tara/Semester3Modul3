package Tugas;

import java.util.Scanner;

public class Tugas3Modul2Before {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tugas3Modul2FilmBefore film1 = new Tugas3Modul2FilmBefore("Avengers", 50000);
        Tugas3Modul2FilmBefore film2 = new Tugas3Modul2FilmBefore("Spider-Man", 45000);
        Tugas3Modul2DiskonBefore diskon = new Tugas3Modul2DiskonBefore("Avengers", 50000);

        System.out.println("=== Daftar Film ===");
        System.out.println("1. Avengers - Rp" + film1.hargaFilm);
        System.out.println("2. Spider-Man - Rp" + film2.hargaFilm);

        System.out.print("\nMasukkan nama film yang ingin ditonton: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan hari: ");
        String hari = input.nextLine();

        double totalHarga;
        if (nama.equalsIgnoreCase("Avengers") || nama.equalsIgnoreCase("Spider-Man")) {
            totalHarga = diskon.hitungHargaDiskon(hari, jumlah);
        } else {
            totalHarga = film1.hitungHarga(jumlah);
        }

        System.out.println("\nTotal harga tiket: Rp" + totalHarga);
        diskon.tampilkanFilmDiskon();
    }
}
