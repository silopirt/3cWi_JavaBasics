package at.jul.projects.oop.calculator.objects;

import at.jul.projects.oop.calculator.Calc;

public class CurrencyCalc extends Calc {

    private double moneyInStandardCurrency;
    private double factorMoneyInOtherCurrency;

    public CurrencyCalc(String nameOfCalc, double numberOne, double numberTwo) {
        super(nameOfCalc, numberOne, numberTwo);
    }

    @Override
    public double calcMultiply() {
        moneyInStandardCurrency= getNumberOne();
        factorMoneyInOtherCurrency = getNumberTwo();

        double returnMoneyWorth = moneyInStandardCurrency*factorMoneyInOtherCurrency;
        return returnMoneyWorth;
    }
}
