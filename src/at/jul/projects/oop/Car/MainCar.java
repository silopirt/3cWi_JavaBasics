package at.jul.projects.oop.Car;

import at.jul.projects.oop.Car.objects.Car;
import at.jul.projects.oop.Car.objects.Engine;
import at.jul.projects.oop.Car.objects.Tank;


public class MainCar {
    public static void main(String[] args) {
        Engine e1 = new Engine(5, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(4, Engine.TYPE.GAS);

        Tank t1 = new Tank(20, Tank.TYPE.DIESEL);
        Tank t2 = new Tank(20, Tank.TYPE.GAS);

        Car c1 = new Car(e1,t1,"red", "A-D-1234");
        Car c2 = new Car(e2,t2,"red", "M-G-1234");

        c1.setEngine(e1);
        c1.setTank(t1);

        c2.setEngine(e2);
        c2.setTank(t2);


        c1.drive(e1.getHorsePower());
        c2.drive(e2.getHorsePower());


    }
}
