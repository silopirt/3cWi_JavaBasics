package at.jul.projects.oop.remote.objects;

public class RemoteBattery {
    private int batteryStatus;

    public RemoteBattery(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }
}
