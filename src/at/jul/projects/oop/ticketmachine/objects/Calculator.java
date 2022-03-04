package at.jul.projects.oop.ticketmachine.objects;

import at.jul.projects.oop.ticketmachine.objects.ticketmanagero.Ticket;

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
