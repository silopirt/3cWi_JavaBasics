package at.jul.projects.oop.ticketmachine.objects;

import at.jul.projects.oop.ticketmachine.objects.ticketmanagero.Ticket;

import java.util.Scanner;

public class Calculator {
    private String id;

    public Calculator(String id) {
        this.id = id;
    }

    public double chargeMoney(Ticket ticket){
        double moneyPerSec = 0.05;

        double seconds = ticket.ticketTimeDiff()/1000;
        double moneyPay = Math.round((seconds*moneyPerSec)*100.00)/100.00;


        return moneyPay;
    }

    public void payTicket(double moneyToPay){
        System.out.println("Sie müssen "+moneyToPay+" zahlen");
        Scanner scanner = new Scanner(System.in);
        double moneyInput = scanner.nextDouble();

        double check = Math.round((moneyToPay-moneyInput)*100.00)/100.00;

        if(check <= 0){
            System.out.println("Gezahlt. Ihr Rückgeld ist: "+check*(-1)+"! Auf Wiedersehen");
        }else if(check>0){
            System.out.println("Sie müssen noch "+ check +" zahlen");
            payTicket(check);
        }
    }

}
