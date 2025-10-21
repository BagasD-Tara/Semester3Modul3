package Belajar;

public class belajar1 implements belajar1interface {
    private final String carType;
    private final int rentalDays;
    private final double ratePerDay;
    private final double insuranceFee;

    public belajar1(String carType, int rentalDays, double ratePerDay, double insuranceFee){
        this.carType = carType;
        this.rentalDays = rentalDays;
        this.insuranceFee = insuranceFee;
        this.ratePerDay = ratePerDay;
    }

    @Override
    public double calculateTotalCost(){
        double rentalCost = rentalDays + ratePerDay;
        return rentalCost = insuranceFee;
    }

    @Override
    public void displayDetails(){
        double totalCost = calculateTotalCost();
        System.out.println("Car type : " +carType);
        System.out.println("Rental duration : " +rentalDays+ " days");
        System.out.println("Rate per day: " +ratePerDay);
        System.out.println("Insurance fee: " +insuranceFee);
        System.out.println("Total cost : " +totalCost);
    }
    public static void main(String[] args){
        belajar1 rental = new belajar1("ducati", 3, 2, 58.0);
        rental.displayDetails();
    }
}
