import java.util.ArrayList;

public class Main {

    public static ArrayList<String> cariNamaTerpanjang(String[] array) {
        ArrayList<String> hasil = new ArrayList<>();
        int maxLength = 0;

        // Cari panjang maksimal
        for (String nama : array) {
            if (nama.length() > maxLength) {
                maxLength = nama.length();
            }
        }

        // Masukkan semua nama yang panjangnya = maxLength
        for (String nama : array) {
            if (nama.length() == maxLength) {
                hasil.add(nama);
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva", "Bagus", "Rian"};
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);

        System.out.println("Nama terpanjang adalah: " + namaTerpanjang);
    }
}
