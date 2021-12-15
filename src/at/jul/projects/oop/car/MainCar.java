package at.jul.projects.oop.car;

import at.jul.projects.oop.car.objects.*;


public class MainCar {
    public static void main(String[] args) {
        Engine e1 = new Engine(5, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(20, Tank.TYPE.DIESEL);


        Car c1 = new Car(e1,t1,"red", "A-D-1234");

        c1.setEngine(e1);
        c1.setTank(t1);
        c1.drive(e1.getHorsePower());

        for (int i = 0; i < 4; i++) {
            Tyres t2 = new Tyres(4,44);
            c1.addTyres(t2);
            if(i<3){
                RearMirror rM = new RearMirror(100, 0);
                c1.addRearMirror(rM);
            }
        }
    }
}
