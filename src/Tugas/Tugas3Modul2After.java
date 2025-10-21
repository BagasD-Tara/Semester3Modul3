package Tugas;

import java.util.Scanner;

public class Tugas3Modul2After {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tugas3Modul2FilmAfter film1 = new Tugas3Modul2FilmAfter("Avengers", 50000);
        Tugas3Modul2FilmAfter film2 = new Tugas3Modul2FilmAfter("Spider-Man", 45000);
        Tugas3Modul2DiskonAfter diskon = new Tugas3Modul2DiskonAfter();

        System.out.println("=== Daftar Film ===");
        System.out.println("1. " + film1.namaFilm + " - Rp" + film1.hargaFilm);
        System.out.println("2. " + film2.namaFilm + " - Rp" + film2.hargaFilm);

        System.out.print("\nMasukkan nama film yang ingin ditonton: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan hari: ");
        String hari = input.nextLine();

        Parameter parameter = new Parameter(hari, jumlah);
        double totalHargaticket = 0;
        //rename

        if (nama.equalsIgnoreCase("Avengers")) {
            totalHargaticket = diskon.hitungHargaDiskon1(parameter, film1);
        } else if (nama.equalsIgnoreCase("Spider-Man")) {
            totalHargaticket = diskon.hitungHargaDiskon1(parameter, film2);
        } else {
            System.out.println("Film tidak ditemukan.");
            System.exit(0);
        }

        System.out.println("\nTotal harga tiket: Rp" + totalHargaticket);
        Tugas3Modul2FilmAfter.tampilkanFilmDiskon2();

        input.close();
    }
}
