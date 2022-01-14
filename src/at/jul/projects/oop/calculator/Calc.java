package at.jul.projects.oop.calculator;


import java.util.Scanner;

public class Calc {

    private String nameOfCalc;
    private double numberOne;
    private double numberTwo;

    public Calc(String nameOfCalc, double numberOne, double  numberTwo) {
        this.nameOfCalc = nameOfCalc;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double calcAddition(){
        int addition = (int)numberOne + (int)numberTwo;
        return addition;
    }

    public double calcSubtract(){
        double subtract = 0;
        int whichNumberGetsSubtracted = getWhichNumberGetsSubtDiv("Input 1 if you want numberOne - numberTwo or input 2 if you want NumberTwo-NumberOne");

        subtract = getSubtract(subtract, whichNumberGetsSubtracted);

        return subtract;
    }


    public double calcMultiply(){
        double multiplication = numberOne* numberTwo;
        return multiplication;
    }

    public double calcDivide(){
        double divide = 0;
        int whichNumberGetsSubtracted = getWhichNumberGetsSubtDiv("Input 1 if you want numberOne / numberTwo or input 2 if you want NumberTwo/NumberOne");
        divide = getDivide(divide, whichNumberGetsSubtracted);

        return divide;
    }


    private double getSubtract(double subtract, int whichNumberGetsSubtracted) {
        if(whichNumberGetsSubtracted == 1){
            subtract = (int)numberOne-(int)numberTwo;
        }else if(whichNumberGetsSubtracted == 2){
            subtract = (int)numberTwo-(int)numberOne;
        }else{
            System.out.println("Input a valid number");
            calcSubtract();
        }
        return subtract;
    }

    private int getWhichNumberGetsSubtDiv(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextInt();
    }

    private double getDivide(double divide, int whichNumberGetsSubtracted) {
        if(whichNumberGetsSubtracted == 1){
            divide = (double)numberOne/(double)numberTwo;
        }else if(whichNumberGetsSubtracted == 2){
            divide = (double)numberTwo/(double)numberOne;
        }else{
            System.out.println("Input a valid number");
            calcDivide();
        }
        return divide;
    }


    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }
}
