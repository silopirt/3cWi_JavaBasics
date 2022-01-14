package at.jul.projects.oop.calculator.objects;

import at.jul.projects.oop.calculator.Calc;

import java.util.Scanner;

public class TaxCalc extends Calc {

    public TaxCalc(String nameOfCalc, double numberOne, double numberTwo) {
        super(nameOfCalc, numberOne, numberTwo);
    }

    public double taxCalc(){

        double calculatedTax = checkNettoBrutto("1 = Eingabe ist der Nettobetrag, 2 = Eingabe ist der Bruttobetrag");

        return calculatedTax;
    }
    private double checkNettoBrutto(String inputOfString){
        double output = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(inputOfString);
        int input = scanner.nextInt();

        if (input == 1){
            output=calcMultiply();
        }else if(input == 2){
            output= calcDivide();
        }
        return output;
    }
}
