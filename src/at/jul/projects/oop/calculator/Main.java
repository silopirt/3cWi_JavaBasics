package at.jul.projects.oop.calculator;

import at.jul.projects.oop.calculator.objects.CurrencyCalc;
import at.jul.projects.oop.calculator.objects.DistanceOfCarCalc;
import at.jul.projects.oop.calculator.objects.GeoCalc;
import at.jul.projects.oop.calculator.objects.TaxCalc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc("Calculator",5,3);
        DistanceOfCarCalc distanceCalc = new DistanceOfCarCalc("Distance calc",70,5);
        CurrencyCalc currencyCalc = new CurrencyCalc("CurrencyCalc",70,0.5);
        GeoCalc geoCalc = new GeoCalc("GeoCalc",4,5,1);
        TaxCalc taxCalc = new TaxCalc("TaxCalc",10,1.1);

        /**
         * System.out.println(calc.calcAddition());
         * System.out.println(calc.calcSubtract());
         * System.out.println(calc.calcMultiply());
         * System.out.println(calc.calcDivide());
         *
         * System.out.println("Man kann noch " +distanceCalc.calcDivide()+ " km fahren.");
         *
         * System.out.println(currencyCalc.calcMultiply());
         *
         * System.out.println(geoCalc.checkIfRectangleOrCircleArea("1 für Rechteck 2 für Kreis"));
         **/
        System.out.println(taxCalc.taxCalc());

    }
}
