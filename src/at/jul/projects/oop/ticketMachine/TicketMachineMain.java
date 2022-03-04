package at.jul.projects.oop.ticketMachine;

import at.jul.projects.oop.ticketMachine.objects.*;

public class TicketMachineMain {
    public static void main(String[] args) {
        Printer printer = new Printer("printer");
        Calculator calc = new Calculator("calc");
        Ticketmanager manager = new Ticketmanager(calc, printer);

        manager.createTicket();
        manager.getTimeDifference(1);
        manager.removeTicket(1);
    }
}
