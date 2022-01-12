package at.jul.projects.oop.calculator;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc("Calculator",5,3);

        System.out.println(calc.calcAddition());
        System.out.println(calc.calcSubtract());
        System.out.println(calc.calcMultiply());
        System.out.println(calc.calcDivide());
    }
}
