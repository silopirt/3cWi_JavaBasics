package at.jul.projects.oop.Car.objects;


public class Car {
    private String color;
    private String serialNumber;

    private int speed;

    private Engine engine;
    private Tank tank;

    //Konstruktor


    public Car(Engine engine, Tank tank,String color, String serialNumber) {
        this.engine = engine;
        this.tank = tank;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    //Methoden
    public void drive(int horsepower){
        this.speed = horsepower + 10;
        System.out.println("I'm driving with this speed" + this.speed);
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
