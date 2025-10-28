Sistem Pemesanan Tiket Bioskop

Deskripsi program
Program ini dibuat menggunakan bahasa Java.
Tujuan program ini adalah untuk mensimulasikan proses pemesanan tiket film, menghitung harga total tiket, serta memberikan diskon khusus pada akhir pekan (Sabtu dan Minggu).


Struktur program 
Modul 3
    Tugas2
        Tugas3Mdoul2Film
        Tugas3Modul2Diskon
        Pemesanan
        Tugas3Modul2

Penjelasan Tiap Kelas

A. Tugas3Modul2Film
Kelas ini merepresentasikan objek film dengan dua atribut utama:
    - namaFilm → nama film (Avengers atau Spider-Man)
    - hargaFilm → harga tiket film

Konstruktor
public Tugas3Modul2Film(String namaFilm, double hargaFilm)

Method
public double hitungHarga(int jumlahTiket):
Menghitung total harga tiket tanpa diskon (hargaFilm * jumlahTiket).

public static void tampilkanFilmDiskon2()
Menampilkan daftar film yang mendapatkan diskon di akhir pekan.
Karena bersifat static, method ini bisa dipanggil tanpa membuat objek.

B. Tugas3Modul2Diskon
Kelas ini digunakan untuk menghitung harga tiket dengan mempertimbangkan diskon akhir pekan.

Atribut Konstanta:
public static final double Diskon = 0.9;
Menandakan besaran diskon sebesar 10% (hanya membayar 90% dari harga normal).
Konstanta ini dibuat untuk menggantikan magic number agar kode lebih mudah dibaca dan dipelihara.

Method:
public double hitungHargaDiskon(Pemesanan pemesanan, Tugas3Modul2Film film)
Menghitung total harga berdasarkan hari pemesanan :
    - Jika hari = Sabtu atau Minggu, maka harga mendapat diskon 10%.
    - Jika bukan, harga tetap normal.

C. pemesanan
File ini menggunakan fitur record di Java, yaitu struktur data sederhana untuk menyimpan informasi tanpa menulis kode getter/setter secara manual.

public record Pemesanan(String hari, int jumlahTiket) { }
Fungsinya untuk menyimpan:
    - hari → hari menonton (misalnya: Senin, Sabtu, Minggu)
    - jumlahTiket → jumlah tiket yang dipesan pengguna

D. Tugas3Modul2
Kelas utama (main class) yang menjalankan program.

Alur program:
1. Program menampilkan daftar film beserta harganya.
2. Pengguna memasukkan:
    - Nama film yang ingin ditonton
    - Jumlah tiket yang ingin dipesan
    - Hari menonton
3. Program membuat objek Pemesanan berdasarkan input pengguna.
4. Program memeriksa apakah hari tersebut termasuk akhir pekan:
    - Jika Sabtu/Minggu, maka total harga dikalikan dengan konstanta Diskon (0.9).
    - Jika bukan, harga normal.
5. Total harga tiket ditampilkan di layar.
6. Daftar film yang mendapatkan diskon ditampilkan kembali.

potongan kode penting :
if (nama.equalsIgnoreCase("Avengers")) {
    totalHargaticket = diskon.hitungHargaDiskon(pemesanan, film1);
} else if (nama.equalsIgnoreCase("Spider-Man")) {
    totalHargaticket = diskon.hitungHargaDiskon(pemesanan, film2);
} else {
    System.out.println("Film tidak ditemukan.");
    System.exit(0);
}

Kode di atas memastikan film yang dipilih valid, dan menentukan film mana yang dihitung total harganya.


