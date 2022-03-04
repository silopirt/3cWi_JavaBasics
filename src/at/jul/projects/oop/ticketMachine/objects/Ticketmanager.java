package at.jul.projects.oop.ticketMachine.objects;

import at.jul.projects.oop.ticketMachine.objects.ticketmanagero.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticketmanager {
    private List<Ticket> tickets;
    private Calculator calculator;
    private Printer printer;

    public Ticketmanager(Calculator calculator, Printer printer) {
        this.printer = printer;
        this.calculator = calculator;
        this.tickets = new ArrayList<>();
    }

    public void createTicket(){
        Ticket ticket = new Ticket(tickets.size()+1);

        tickets.add(ticket);
    }

    public void removeTicket(int tickerIDNumber){
        tickets.remove(searchForTicket(tickerIDNumber));
    }

    public void getTimeDifference(int tickerIDNumber){
        Ticket ticketTimeDifference = searchForTicket(tickerIDNumber);

        System.out.println(calculator.chargeMoney(ticketTimeDifference));
    }



    private Ticket searchForTicket(int tickerIDNumber) {
        Ticket ticketReturn = null;
        for (int i = 0; i < tickets.size(); i++) {
            if(tickerIDNumber == tickets.get(i).getId()){
                ticketReturn = tickets.get(i);
            }
        }
        return ticketReturn;
    }
}
