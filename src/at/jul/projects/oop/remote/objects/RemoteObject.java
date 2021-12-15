package at.jul.projects.oop.remote.objects;

import java.util.ArrayList;
import java.util.List;

public class RemoteObject {
    private List<RemoteBattery> batteries;
    private int PowerStatus;

    public RemoteObject(int batteryStatus) {
        this.PowerStatus = batteryStatus;
        this.batteries = new ArrayList<>();
    }


    public int turnOn(int status){
        int statusGetsWeaker = status * (5/100);
        status = status - statusGetsWeaker;
        System.out.println("Der Verbraucher ist angeschlossen");
        return status;
    }
    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public int getLoadingState(){
        int statusBatteryOne=this.batteries.get(0).getBatteryStatus();
        int statusBatteryTwo = this.batteries.get(1).getBatteryStatus();
        return;
    }

}
