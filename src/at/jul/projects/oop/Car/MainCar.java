package at.jul.projects.oop.Car;

import at.jul.projects.oop.Car.objects.Car;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int honkAmount = scanner.nextInt();

        Car c1 = new Car("rot",5,1234,20);

        System.out.println(c1.fuelAmount);
        c1.drive();
        c1.stop();
        c1.turboBoost();
        c1.honk(honkAmount);
        c1.getRemainingRange();
        System.out.println(c1.fuelAmount);
    }
}
