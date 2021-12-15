package at.jul.projects.oop.Car.objects;


import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private String serialNumber;

    private int speed;

    private Engine engine;
    private Tank tank;
    private List<Tyres> tyres;
    private List<RearMirror> mirrors;

    //Konstruktor


    public Car(Engine engine, Tank tank,String color, String serialNumber) {
        this.tyres = new ArrayList<>();
        this.mirrors = new ArrayList<>();
        this.engine = engine;
        this.tank = tank;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    //Methoden
    public void addRearMirror(RearMirror mirrors){
        this.mirrors.add(mirrors);
    }
    public void addTyres(Tyres tyres){
        this.tyres.add(tyres);
    }

    public List<Tyres> getTyres() {
        return tyres;
    }
    public List<RearMirror> getMirrors() {
        return mirrors;
    }



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
