package Tugas;

public class Tugas3Modul2DiskonBefore {
    String namaFilm;
    double hargaFilm;

    public Tugas3Modul2DiskonBefore(String namaFilm, double hargaFilm) {
        this.namaFilm = namaFilm;
        this.hargaFilm = hargaFilm;
    }

    public double hitungHargaDiskon(String hari, int jumlahTiket) {
        double total = hargaFilm * jumlahTiket;
        if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
            total = total * 0.9;
        }
        return total;
    }

    public void tampilkanFilmDiskon() {
        System.out.println("Film yang mendapat diskon akhir pekan: \n- Avengers\n- Spider-Man");
    }
}
