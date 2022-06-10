package at.jul.schoolcheck.testSecondSemester;

import at.jul.schoolcheck.testSecondSemester.Objects.Beans;
import at.jul.schoolcheck.testSecondSemester.Objects.Controll;
import at.jul.schoolcheck.testSecondSemester.Objects.Watertank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Watertank watertank = new Watertank(1000);
        Beans beans = new Beans(100);
        Controll controll = new Controll(watertank, beans);

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 um Kaffee zu machen, 2 um Maschine ausschalten");
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    controll.makeCoffee();
                    break;
                case 2:
                    controll.shutDownMachine();
                    return;
            }

        }
    }
}
