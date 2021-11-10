package at.jul.projects.basic;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        System.out.println("-Geben sie 1 ein, um Geld einzuzahlen \n" +
                            "-Geben sie 2 ein, um Geld abzuheben \n" +
                            "-Geben sie 3 ein, um ihren Kontostand zu sehen\n" +
                            "-Geben sie 4 ein, um den Vorgang zu beenden");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        double accountStand = 0;
        boolean finish = true;

        while(finish){
            if(selection == 1) {
                System.out.println("Geben sie den Geldwert an den sie einzahlen wollen");
                double input = scanner.nextDouble();
                accountStand = accountStand + input;
                System.out.println("Wählen sie den nächsten Vorgang.");
                selection = scanner.nextInt();
            }else if(selection == 2) {
                System.out.println("Geben sie den Geldwert an den sie ausbezahlen wollen");
                double output = scanner.nextDouble();
                accountStand = accountStand - output;
                System.out.println("Wählen sie den nächsten Vorgang.");
                selection = scanner.nextInt();
            }else if(selection == 3) {
                System.out.println("Ihr Kontostand beträgt: " + accountStand);
                System.out.println("Wählen sie den nächsten Vorgang.");
                selection = scanner.nextInt();
            }else if(selection == 4){
               finish = false;
            }
        }
    }
}

