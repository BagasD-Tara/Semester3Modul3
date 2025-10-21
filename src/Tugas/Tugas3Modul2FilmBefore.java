package Tugas;

public class Tugas3Modul2FilmBefore {
    String namaFilm;
    double hargaFilm;

    public Tugas3Modul2FilmBefore(String namaFilm, double hargaFilm) {
        this.namaFilm = namaFilm;
        this.hargaFilm = hargaFilm;
    }

    public double hitungHarga(int jumlahTiket) {
        return hargaFilm * jumlahTiket;
    }

    public void tampilkanFilmDiskon() {
        System.out.println("Film yang mendapat diskon akhir pekan: \n- Avengers\n- Spider-Man");
    }
}
