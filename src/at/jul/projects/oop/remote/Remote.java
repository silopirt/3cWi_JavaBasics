package at.jul.projects.oop.remote;
import at.jul.projects.oop.remote.objects.*;

import java.util.Scanner;


public class Remote {
    public static void main(String[] args) {
        RemoteObject remoteObject = new RemoteObject();
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input >=0 && input<=100) {
                RemoteBattery battery = new RemoteBattery(input);
                remoteObject.addRemoteBattery(battery);
            }
        }
        int loadingState = 0;

        loadingState = remoteObject.getLoadingState();
        System.out.println(loadingState);
    }
}
