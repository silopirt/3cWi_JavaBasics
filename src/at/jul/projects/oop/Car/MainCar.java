package at.jul.projects.oop.Car;

import at.jul.projects.oop.Car.objects.Car;

public class MainCar {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "rot";
        c1.fuelConsumption = 3;
        c1.fuelAmount = 20;
        c1.serialNumber = 1234;

        System.out.println(c1.fuelAmount);
        c1.drive();
        c1.stop();
        System.out.println(c1.fuelAmount);
    }
}
