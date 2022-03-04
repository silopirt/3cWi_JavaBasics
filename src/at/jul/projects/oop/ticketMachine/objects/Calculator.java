package at.jul.projects.oop.ticketMachine.objects;

import at.jul.projects.oop.ticketMachine.objects.ticketmanagero.Ticket;

import java.text.DecimalFormat;

public class Calculator {
    private String id;

    public Calculator(String id) {
        this.id = id;
    }

    public double chargeMoney(Ticket ticket){
        double moneyPerSec = 0.01;
        double moneyPay = (ticket.ticketTimeDiff()*moneyPerSec);


        return moneyPay;
    }

}
