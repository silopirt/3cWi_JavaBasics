package at.jul.projects.oop.carsnew.objects;

public class Engine {
    public enum TYPE {DIESEL, GAS}


    private TYPE type;
    private int powerOffCar;

    public Engine(TYPE type, int powerOffCar) {
        this.type = type;
        this.powerOffCar = powerOffCar;
    }
}
