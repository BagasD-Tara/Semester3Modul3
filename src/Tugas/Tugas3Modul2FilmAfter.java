package Tugas;

public class Tugas3Modul2FilmAfter {
    String namaFilm;
    double hargaFilm;

    public Tugas3Modul2FilmAfter(String namaFilm, double hargaFilm) {
        this.namaFilm = namaFilm;
        this.hargaFilm = hargaFilm;
    }

    //rename
    public static void tampilkanFilmDiskon2() {
        System.out.println("Film yang mendapat diskon akhir pekan: \n- Avengers\n- Spider-Man");
    }

    public double hitungHarga(int jumlahTiket) {
        return hargaFilm * jumlahTiket;
    }
}

