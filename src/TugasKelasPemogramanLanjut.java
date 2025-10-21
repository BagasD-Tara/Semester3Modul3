import java.util.Scanner;

public class TugasKelasPemogramanLanjut {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Masukkan usia Anda: ");
            int age = scan.nextInt();

            if (age <= 0 || age >= 120){
                throw new Exception("Usia tidak valid! Usia harus antara 1 hingga 119.");
            }

            System.out.println("Usia valid: " + age);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}