package at.jul.projects.oop.calculator.objects;
import at.jul.projects.oop.calculator.Calc;

public class DistanceOfCarCalc extends Calc {

    private int tank;
    private double usage;

    public DistanceOfCarCalc(String nameOfCalc,double numberOne, double numberTwo) {
        super(nameOfCalc, numberOne, numberTwo);
    }




    @Override
    public double calcDivide() {
        tank = (int)getNumberOne();
        usage = getNumberTwo();
        double distance = 0;
        distance = tank/usage * 100;
        return distance;
    }
}
