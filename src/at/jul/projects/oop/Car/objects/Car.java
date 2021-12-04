package at.jul.projects.oop.Car.objects;

public class Car {
    public String color;
    public int fuelConsumption;
    public int serialNumber;
    public int fuelAmount;

    //Konstruktor
    public Car(String colorConstr, int fuelConsumptionConstr, int serialNumberConstr, int fuelAmountConstr){
        this.color = colorConstr;
        this.fuelConsumption = fuelConsumptionConstr;
        this.serialNumber = serialNumberConstr;
        this.fuelAmount = fuelAmountConstr;
    }


    //Methoden
    public void drive(){
        this.fuelAmount = this.fuelAmount-this.fuelConsumption;
        System.out.println("I'm driving");
    }

    public void stop(){
        System.out.println("BREAK");
    }

    public void turboBoost(){
        if(this.fuelAmount> fuelAmount *0.1){
            System.out.println("SuperBoostMode");
        }else{
            System.out.println("not enough fuel for boost");
        }
    }

    public void honk(int honkAmount){
        for (int i = 0; i < honkAmount; i++) {
            System.out.println("TUUT");
        }
    }

    public void getRemainingRange(){
        int restRange = this.fuelAmount;
        System.out.println(restRange);
    }
}
