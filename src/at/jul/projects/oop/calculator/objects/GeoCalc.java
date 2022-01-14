package at.jul.projects.oop.calculator.objects;

import at.jul.projects.oop.calculator.Calc;

import java.util.Scanner;

public class GeoCalc extends Calc {
    private double radius;

    public GeoCalc(String nameOfCalc, double numberOne, double numberTwo, double radius) {
        super(nameOfCalc, numberOne, numberTwo);
        this.radius = radius;
    }

    @Override
    public double calcAddition() {
        double size = getNumberOne()+getNumberOne() + getNumberTwo()+getNumberTwo();
        return size;
    }

    @Override
    public double calcMultiply() {
        double sizeCircle = 2*Math.PI*radius;
        return sizeCircle;
    }

    public double checkIfRectangleOrCircleArea(String inputOfString){
        double output = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(inputOfString);
        int checker = scanner.nextInt();
        if(checker == 1){
            output= calcAddition();
        }else{
            output = calcMultiply();
        }
        return output;
    }
}
