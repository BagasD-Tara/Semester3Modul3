package Modul3.Tugas2;

public class Tugas3Modul2Diskon {
    public static final double Diskon = 0.9;

    /**
     *public static final double Diskon = 0.9; --> replace magic number with Symbolic Constant
     */

    public double hitungHargaDiskon(Pemesanan pemesanan, Tugas3Modul2Film film) {
        /**
         * Pemesanan pemesanan hasil introduce parameter objek dari String hari, int jumlahTiket
         */
        if (pemesanan.hari().equalsIgnoreCase("Sabtu") || pemesanan.hari().equalsIgnoreCase("Minggu")) {
            return film.hargaFilm * pemesanan.jumlahTiket() * Diskon;
        }
        /**
         * return film.hargaFilm * pemesanan.jumlahTiket(); --> inline variable
         */
        return film.hargaFilm * pemesanan.jumlahTiket();
    }
}


