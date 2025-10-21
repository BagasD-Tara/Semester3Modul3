import java.util.Scanner;
import java.util.InputMismatchException;

public class TugasLab1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Masukkan jumlah angka: ");
            int n = scanner.nextInt();

            if (n <= 0){
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }

            double[] angka = new double[n];
            System.out.println("Masukkan angka-angka(bisa desimal): ");
            for (int i = 0; i < n;){
                if (scanner.hasNextDouble()){
                    angka[i] = scanner.nextDouble();
                    i++;
                } else {
                    System.out.println("Input tidak valid. Masukkan angka yang benar.");
                    scanner.next();
                }
            }

            int total = 0;
            for(int i = 0; i < n; i++){
                total += angka[i];
            }

            double rataRata = total / n;
            System.out.printf("Rata-rata adalah: ", rataRata);

        }catch (InputMismatchException e){
            System.out.println("Input tidak valid. Pastikan memasukkan angka.");
        }finally {
            scanner.close();
        }
    }
}
