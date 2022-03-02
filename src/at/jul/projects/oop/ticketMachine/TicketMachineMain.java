package at.jul.projects.oop.ticketMachine;

import at.jul.projects.oop.ticketMachine.objects.Calculator;
import at.jul.projects.oop.ticketMachine.objects.Printer;
import at.jul.projects.oop.ticketMachine.objects.Ticketmanager;

import java.util.Scanner;

public class TicketMachineMain {
    public static void main(String[] args) {
        Printer printer = new Printer("printer");
        Calculator calc = new Calculator("calc");
        Ticketmanager manager= new Ticketmanager(calc,printer);



        while(true) {
            Scanner scanner = new Scanner(System.in);
            int usage = scanner.nextInt();
            if (usage == 1) {
                manager.createTicket();
                manager.createTicket();
                manager.createTicket();
            } else if (usage == 2) {
                manager.payTicket(2);
            }else if(usage == 3){
                return;
            }
        }
    }
}
