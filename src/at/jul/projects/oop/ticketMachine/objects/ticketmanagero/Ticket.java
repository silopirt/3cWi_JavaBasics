package at.jul.projects.oop.ticketMachine.objects.ticketmanagero;


import java.util.Date;

public class Ticket {
    private int id;
    private Date dateWhenPrinted;
    private Date dateWhenPaid;

    public Ticket(int id) {
        this.id = id;
        this.dateWhenPrinted = new Date();
    }

    public long getDateWhenPrinted() {
        return dateWhenPrinted.getTime();
    }

    public long getDateWhenPaid() {
        dateWhenPaid = new Date();
        return dateWhenPaid.getTime();
    }

    public long ticketTimeDiff(){
        dateWhenPaid = new Date();

        long timeDiff = dateWhenPaid.getTime()-dateWhenPrinted.getTime();
        return timeDiff;
    }

    public int getId() {
        return id;
    }
}
