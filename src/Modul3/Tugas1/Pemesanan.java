package Modul3.Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pemesanan {
    private ArrayList<MenuItem> daftarMakanan;
    private ArrayList<MenuItem> daftarMinuman;
    private ArrayList<MenuItem> pesanan;
    private Scanner input;

    public Pemesanan(){
        input = new Scanner(System.in);
        pesanan = new ArrayList<>();
        daftarMakanan = new ArrayList<>();
        daftarMinuman = new ArrayList<>();
        inisialisasiMenu();
    }

    private void inisialisasiMenu(){
        daftarMakanan.add(new MenuItem("Nasih Ayam goreng", 25000));
        daftarMakanan.add(new MenuItem("Nasi Rawon", 25000));
        daftarMakanan.add(new MenuItem("Nasi Soto", 15000));
        daftarMakanan.add(new MenuItem("Nasi Ayam Geprek", 15000));

        daftarMinuman.add(new MenuItem("Es Teh", 5000));
        daftarMinuman.add(new MenuItem("Es Jeruk", 5000));
        daftarMinuman.add(new MenuItem("Jus Dragon Fruit", 10000));
        daftarMinuman.add(new MenuItem("Pink Volcano", 15000));
    }

    private void tampilkanMenu(){
        System.out.println("\n=== MENU MAKANAN ===");
        for (int i = 0; i < daftarMakanan.size(); i++){
            System.out.println((i + 1) + ". " + daftarMakanan.get(i));
        }

        System.out.println("\n=== MENU MINUMAN ===");
        for (int i = 0; i < daftarMinuman.size(); i++){
            System.out.println((i + 1 + daftarMinuman.size()) + ". " + daftarMinuman.get(i));
        }
    }

    private MenuItem pilihmenu(){
        System.out.println("\nMasukkan nomor menu yang ingin dipesan: ");
        int pilihan = input.nextInt();

        int jumlahMakanan = daftarMakanan.size();
        int jumlahMinuman = daftarMinuman.size();

        if (pilihan >= 1 && pilihan <= jumlahMakanan){
            return daftarMakanan.get(pilihan - 1);
        } else if (pilihan > jumlahMakanan && pilihan <= jumlahMakanan + jumlahMinuman) {
            int indexMinuman = pilihan - jumlahMakanan - 1;
            return daftarMinuman.get(indexMinuman);
        }else {
            System.out.println("Pilihan tidak valid!");
            return null;
        }
    }

    public void MulaiPemesanan(){
        boolean lanjut = true;
        System.out.println("=== SELAMAT DATANG DI RESTORAN SERBA ADA ===");

        while(lanjut){
            tampilkanMenu();
            MenuItem item = pilihmenu();
            if (item != null){
                pesanan.add(item);
                System.out.println("Anda memesan: " +item.getName());
            }

            System.out.println("\nApakah anda ingin memesan lagi? (y/n)");
            String jawab = input.next();
            lanjut = jawab.equalsIgnoreCase("y");
        }

        tampilkanStruk();
    }

    private void tampilkanStruk(){
        System.out.println("\n=== DETAIL PESANAN ANDA ===");
        int total = 0;

        for(int i = 0; i < pesanan.size(); i++){
            MenuItem item = pesanan.get(i);
            System.out.printf("%-2d. %-25s Rp %d%n", (i + 1), item.getName(), item.getHarga());
            total += item.getHarga();
        }

        System.out.println("==========================");
        System.out.println("Total yang harus dibayar: Rp " +total);
        System.out.println("Terimkasih sudah memesan!");
    }
}
