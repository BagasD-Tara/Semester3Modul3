package Tugas;

public class MainApp {
    public static void main(String[] args){
        TaxTicket ticket = new TaxTicket(new TicketInfo(50.0, "airport", "Downtown", 30.0, "Alice", 60.0));

        ticket.detailedInfo();

        ticket.checkStatus();
        ticket.displayEstimatedDuration();

        ticket.sLowDown(20);
        ticket.speedUp(15);
    }
}
