package at.jul.projects.oop.ticketMachine.objects;

public class Calculator {
    private String id;

    public Calculator(String id) {
        this.id = id;
    }

    public double chargeMoney(long timeWhenPrinted, long timeWhenPaid){
        long differenceSec = timeWhenPaid-timeWhenPrinted;

        double timeToCalc = (differenceSec/1000);
        double moneyPerSec = 0.01;

        return timeToCalc*moneyPerSec;
    }

}
