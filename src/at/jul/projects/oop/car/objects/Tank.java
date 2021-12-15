package at.jul.projects.oop.car.objects;

public class Tank {
    public enum TYPE {DIESEL, GAS}
    private int fuelAmount;
    private TYPE type;

    public Tank(int fuelAmount, TYPE type) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }
}
