package Modul3.Tugas2;

import Tugas.Parameter;
import Modul3.Tugas2.Tugas3Modul2Diskon;
import Modul3.Tugas2.Tugas3Modul2Film;

import java.util.Scanner;

public class Tugas3Modul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tugas3Modul2Film film1 = new Tugas3Modul2Film("Avengers", 50000);
        Tugas3Modul2Film film2 = new Tugas3Modul2Film("Spider-Man", 45000);
        Tugas3Modul2Diskon diskon = new Tugas3Modul2Diskon();

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

        Pemesanan pemesanan = new Pemesanan(hari, jumlah);
        double totalHargaticket = 0;
        //rename

        if (nama.equalsIgnoreCase("Avengers")) {
            totalHargaticket = diskon.hitungHargaDiskon(pemesanan, film1);
        } else if (nama.equalsIgnoreCase("Spider-Man")) {
            totalHargaticket = diskon.hitungHargaDiskon(pemesanan, film2);
        } else {
            System.out.println("Film tidak ditemukan.");
            System.exit(0);
        }
        /**
         * jadi code diatas itu logicnya :
         * ketika user mengetikkan avengers dia akan memanggil method hitungHargaDiskon di class Tugas3Modul2Diskon
         * jika senin - jumat blok code yang dipanggil : return film.hargaFilm * pemesanan.jumlahTiket();
         * jika sabtu dan minggu blok code yang dipanggil : return film.hargaFilm * pemesanan.jumlahTiket() * Diskon;
         *
         * ketika user mengetikkan avengers dia akan memanggil method hitungHargaDiskon di class Tugas3Modul2Diskon
         * jika senin - jumat blok code yang dipanggil : return film.hargaFilm * pemesanan.jumlahTiket();
         * jika sabtu dan minggu blok code yang dipanggil : return film.hargaFilm * pemesanan.jumlahTiket() * Diskon;
         */

        System.out.println("\nTotal harga tiket: Rp" + totalHargaticket);
        Tugas3Modul2Film.tampilkanFilmDiskon2();

        System.out.println("terimakasih");
        input.close();
    }
}
