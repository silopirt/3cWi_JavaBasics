package at.jul.projects.oop.calculator;


import java.util.Scanner;

public class Calc {

    private String nameOfCalc;
    private int numberOne;
    private int numberTwo;

    public Calc(String nameOfCalc, int numberOne, int numberTwo) {
        this.nameOfCalc = nameOfCalc;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int calcAddition(){
        int addition = numberOne + numberTwo;
        return addition;
    }

    public int calcSubtract(){
        int subtract = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 if you want numberOne - numberTwo or input 2 if you want NumberTwo-NumberOne");
        int whichNumberGetsSubtracted = scanner.nextInt();

        if(whichNumberGetsSubtracted == 1){
            subtract = numberOne-numberTwo;
        }else if(whichNumberGetsSubtracted == 2){
            subtract = numberTwo-numberOne;
        }else{
            System.out.println("Input a valid number");
            calcSubtract();
        }

        return subtract;
    }

    public int calcMultiply(){
        int multiplikation = numberOne* numberTwo;
        return multiplikation;
    }

    public int calcDivide(){
        int divide = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 if you want numberOne / numberTwo or input 2 if you want NumberTwo/NumberOne");
        int whichNumberGetsSubtracted = scanner.nextInt();

        if(whichNumberGetsSubtracted == 1){
            divide = numberOne/numberTwo;
        }else if(whichNumberGetsSubtracted == 2){
            divide = numberTwo/numberOne;
        }else{
            System.out.println("Input a valid number");
            calcDivide();
        }

        return divide;
    }

}
