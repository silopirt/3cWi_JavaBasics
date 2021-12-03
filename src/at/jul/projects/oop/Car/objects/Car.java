package at.jul.projects.oop.Car.objects;

public class Car {
    public String color;
    public int fuelConsumption;
    public int serialNumber;
    public int fuelAmount;

    public void drive(){
        this.fuelAmount = this.fuelAmount-this.fuelConsumption;
        System.out.println("I'm driving");
    }

    public void stop(){
        System.out.println("BREAK");
    }
}
