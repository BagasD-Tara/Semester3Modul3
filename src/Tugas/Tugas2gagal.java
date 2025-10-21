package Tugas;

public class Tugas2gagal {
    public static final double DOUBLE = 0.1;
    public String pName;
    public String slocation;
    public String dest;
    public double prc;
    private double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public Tugas2gagal(String passengerName, String startlocation, String destination, double price, double duration, double speed){
        this.pName = passengerName;
        this.slocation = startlocation;
        this.dest = destination;
        this.prc = price;
        this.duration = duration;
        this.speed = speed;
    }

    public void cS(){
        System.out.println("Your taxi is heading: " +dest);
    }

    public void dED(){
        System.out.println("Estimated travel duration: " +duration+ " minutes");
    }

    public void dR(){
        System.out.println("Route: " +slocation+ " -> " +dest);
    }

    public void slowDown(double speedReduction){
        speed -= speedReduction;
        if(speed < MIN_SPEED)
            speed = MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! current speed: " +speed+ " km/h");
    }

    public void speedup(double speedIncrease){
        speed += speedIncrease;
        if (speed > MAX_SPEED)
            speed = MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " +speed+ " km/h");
    }

    public void dI(){

        System.out.println("Passenger name: " +pName);
        System.out.println("Start location: " +slocation);
        System.out.println("Destination: " +dest);
        System.out.println("Price: " +prc);
        System.out.println("Final price: " + (prc + (prc * DOUBLE)));
    }

    public void detailedInfo(){
        dI();
        System.out.println("Duration: " +duration+ " minutes");
        System.out.println("Speed: " +speed+ " km/h");
    }

    public static void main(String[] args){
        Tugas2gagal ticket = new Tugas2gagal("Alice", "Downtown", "Airport", 50.0, 30.0, 60.0);

        ticket.detailedInfo();

        ticket.cS();

        ticket.dR();
        ticket.dED();

        ticket.slowDown(20);
        ticket.speedup(15);
    }
}
