package at.jul.projects.oop.carsnew.objects;

import java.util.Scanner;

public class Car {
    private String color;
    private int maxSpeed;
    private int basicPrice;
    private double basicFuelUsage;

    private Engine engine;
    private Producer producer;

    public Car(Engine engine, Producer producer,String color, int maxSpeed, int basicPrice, int basicFuelUsage) {
        this.engine = engine;
        this.producer = producer;

        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPrice;
        this.basicFuelUsage = basicFuelUsage;
    }

    public void price(){
        double rabbat = this.producer.getRabatt();

        double price = basicPrice-(basicPrice * rabbat);
        System.out.println(basicPrice);
        System.out.println(price);
    }

    public void fuelUsage(){
        Scanner scanner = new Scanner(System.in);

        int kilometersDriven = scanner.nextInt();

        if(kilometersDriven > 50000){
          double percent = 1.098;
          setBasicFuelUsage(basicFuelUsage*percent);

          double newFuelUsage = getBasicFuelUsage();
          System.out.println(newFuelUsage);

        }else{
            double fuelUsageV = getBasicFuelUsage();
            System.out.println(fuelUsageV);
        }
    }

    public double getBasicFuelUsage() {
        return basicFuelUsage;
    }

    public void setBasicFuelUsage(double basicFuelUsage) {
        this.basicFuelUsage = basicFuelUsage;
    }
}
