package Tugas;

public abstract class Ticket {
    public String passengerName;
    public String startLocation;
    public String destination;
    public double price;

    public Ticket(String passengername, String startlocation, String destination, double price) {
        this.passengerName = passengername;
        this.startLocation = startlocation;
        this.destination = destination;
        this.price = price;
    }

    public abstract void displayInfo();
}
