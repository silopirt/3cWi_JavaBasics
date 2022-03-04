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
            System.out.println("1, 2 oder 3");
            int usage = scanner.nextInt();
            if (usage == 1) {
                manager.createTicket();
                manager.createTicket();
                manager.createTicket();
            } else if (usage == 2) {
                System.out.println("Sie müssen " + manager.getMoneyFromTicket(2) + " Euro zahlen");
            }else if(usage == 3){
                return;
            }
        }
    }
}
