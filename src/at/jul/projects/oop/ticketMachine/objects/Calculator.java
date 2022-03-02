package at.jul.projects.oop.ticketMachine.objects;

public class Calculator {
    private String id;

    public Calculator(String id) {
        this.id = id;
    }

    public double chargeMoney(long time){
        long differenceSec = (time/1000);
        double moneyPerSec = 0.01;

        double moneyWhichMustBePaid = differenceSec * moneyPerSec;
        return moneyWhichMustBePaid;
    }
}
