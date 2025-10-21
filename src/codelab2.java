import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class codelab2 {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 120) {
            throw new InvalidAgeException("Usia tidak valid! Usia harus antara 1 hingga 119.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan usia Anda: ");
            int age = scanner.nextInt();

            validateAge(age);

            System.out.println("Usia valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid! Harus berupa angka.");
        }
    }
}
