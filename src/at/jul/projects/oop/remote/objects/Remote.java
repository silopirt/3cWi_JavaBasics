package at.jul.projects.oop.remote.objects;


import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public void addRemoteBattery(Battery battery){
        this.batteries.add(battery);
    }

    public Remote() {
        this.batteries = new ArrayList<>();
    }


    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }
    public void turnOn(){
        int statusBatteryOne=this.batteries.get(0).getBatteryStatus();
        int statusBatteryTwo = this.batteries.get(1).getBatteryStatus();

        this.batteries.get(0).setBatteryStatus(statusBatteryOne-(statusBatteryOne * 5/100));
        this.batteries.get(1).setBatteryStatus(statusBatteryTwo-(statusBatteryTwo * 5/100));

        int statusBatteryOneNew=this.batteries.get(0).getBatteryStatus();
        int statusBatteryTwoNew= this.batteries.get(1).getBatteryStatus();

        System.out.println("Verbraucher eingeschaltet" + statusBatteryOneNew + " " + statusBatteryTwoNew);

    }


    public int getLoadingState(){
        int statusBatteryOne=this.batteries.get(0).getBatteryStatus();
        int statusBatteryTwo = this.batteries.get(1).getBatteryStatus();

        return (statusBatteryOne+statusBatteryTwo)/2;
    }


}
