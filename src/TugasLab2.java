import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class TugasLab2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Masukkan angka positif:");
            int angka = scan.nextInt();

            if(angka <= 0){
                throw new InvalidNumberException("Error! angka harus lebih besar dari nol");
            }

            System.out.println("Angka valid: " + angka);
        }catch (InvalidNumberException e){
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Input tidak valid! Harus berupa angka.");
        }finally {
            scan.close();
        }
    }
}
