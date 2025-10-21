import java.util.Scanner;

public class TugasLab3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa: ");
        String nama = scan.nextLine();

        System.out.println("Masukkan nilai ujian terakhir: ");
        int nilai = scan.nextInt();

        String status;
        if (nilai >= 60){
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("\n ==== Hasil kelulusan ==== ");
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Status: " + status);

        scan.close();
    }
}

//deskripsi formal
//Program menerima dua input: nama mahasiswa (string) dan nilai ujian akhir (integer).
//Program memproses data dengan logika berikut:
//Jika nilai ≥ 60, maka mahasiswa dinyatakan Lulus.
//Jika nilai < 60, maka mahasiswa dinyatakan Tidak Lulus.
//Program kemudian menampilkan output berupa nama mahasiswa dan status kelulusan.

//deskripsi informal
//Program ini digunakan oleh guru untuk menentukan kelulusan mahasiswa berdasarkan nilai ujian akhir.
// Guru memasukkan nama mahasiswa dan nilai ujian. Jika nilai mahasiswa 60 atau lebih, program akan menampilkan bahwa mahasiswa tersebut Lulus. Jika nilai kurang dari 60, maka program menampilkan bahwa mahasiswa Tidak Lulus.