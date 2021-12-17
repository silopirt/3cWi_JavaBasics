package at.jul.projects.oop.remote.objects;

public class Battery {
    private int batteryStatus;

    public Battery(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }
}
