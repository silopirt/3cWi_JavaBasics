package at.jul.projects.oop.ticketmachine;

import at.jul.projects.oop.ticketmachine.objects.*;

import java.util.Scanner;

public class TicketMachineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator("calc");
        Ticketmanager manager = new Ticketmanager(calc);

        while(true) {
            int choseWhichAction = scanner.nextInt();

            switch (choseWhichAction){
                case 1:
                    manager.createTicket();
                    break;
                case 2:
                    System.out.println("Geben sie die Ticket ID an");
                    manager.payAndRemoveTicket(scanner.nextInt());
                    break;
                case 3:
                    return;
            }
        }
    }
}
