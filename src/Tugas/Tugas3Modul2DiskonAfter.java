package Tugas;

public class Tugas3Modul2DiskonAfter {

    public static final double Diskon = 0.9;

    public double hitungHargaDiskon1(Parameter parameter, Tugas3Modul2FilmAfter film) {
        if (parameter.hari().equalsIgnoreCase("Sabtu") || parameter.hari().equalsIgnoreCase("Minggu")) {
            return film.hargaFilm * parameter.jumlahTiket() * Diskon;
        }
        return film.hargaFilm * parameter.jumlahTiket();6
    }
}

//inline variabel
//introduce parameter
// Replace Magic Number with Symbolic Constant
//rename
