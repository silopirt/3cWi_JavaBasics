package at.jul.projects.oop.carsnew;

import at.jul.projects.oop.carsnew.objects.Car;
import at.jul.projects.oop.carsnew.objects.Engine;
import at.jul.projects.oop.carsnew.objects.Producer;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(Engine.TYPE.DIESEL);
        Producer p1 = new Producer("Austria","Porsche", 0.05);

        Car carOne = new Car(e1,p1,"red", 250, 200000);


    }
}
