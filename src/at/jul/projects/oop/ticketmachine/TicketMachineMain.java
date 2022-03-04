package at.jul.projects.oop.ticketmachine;

import at.jul.projects.oop.ticketmachine.objects.*;

public class TicketMachineMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator("calc");
        Ticketmanager manager = new Ticketmanager(calc);

        manager.createTicket();
        manager.getTimeDifference(1);
        manager.removeTicket(1);
    }
}
