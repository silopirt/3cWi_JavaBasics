package at.jul.projects.oop.remote;
import at.jul.projects.oop.remote.objects.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Remote remoteObject = new Remote();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int input = scanner.nextInt();
            if (input >=0 && input<=100) {
                Battery battery = new Battery(input);
                remoteObject.addRemoteBattery(battery);
            }
        }
        outputTrueOrFalse(remoteObject, scanner);
    }

    private static void outputTrueOrFalse(Remote remoteObject, Scanner scanner) {
        while(true) {
            System.out.println("modus");
            int selection = scanner.nextInt();
            loadingState(remoteObject);
            if (selection == 1) {
                remoteObject.turnOn();
            } else {
                remoteObject.turnOff();
                break;
            }

            loadingState(remoteObject);
        }
    }

    private static void loadingState(Remote remoteObject) {
        int loadingState;
        loadingState = remoteObject.getLoadingState();
        System.out.println(loadingState);
    }
}
