package at.jul.projects.oop.ticketMachine.objects;

import at.jul.projects.oop.ticketMachine.objects.ticketmanagero.Ticket;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(tickets.size());
    }

    public double getMoneyFromTicket(int ticketID){
        double calculatedMoney = 0;
        for (int i = 0; i < tickets.size(); i++) {
            if(tickets.get(i).getId() == ticketID){
                calculatedMoney = calculator.chargeMoney(tickets.get(i).getDateWhenPrinted(),tickets.get(i).getDateWhenPaid());
            }
        }
        return calculatedMoney;
    }

    public void payTicket(double moneyToPay){

    }
}
