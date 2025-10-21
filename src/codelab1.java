import java.util.ArrayList;

public class codelab1 {

    public static ArrayList<String> cariNamaTerpanjang(String[] array){
        ArrayList<String> hasil = new ArrayList<>();
        int maxLength = 0;

        for (String nama : array){
            if (nama.length() > maxLength){
                maxLength = nama.length();
            }
        }

        for (String nama : array){
            if (nama.length() == maxLength){
                hasil.add(nama);
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);
        System.out.println("nama terpanjang adalah: " + namaTerpanjang);
    }
}
