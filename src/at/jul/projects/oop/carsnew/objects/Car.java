package at.jul.projects.oop.carsnew.objects;

public class Car {
    private String color;
    private int maxSpeed;
    private int basicPrice;


    private Engine engine;
    private Producer producer;

    public Car(Engine engine, Producer producer,String color, int maxSpeed, int basicPrice) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPrice;
        this.engine = engine;
        this.producer = producer;
    }
}
