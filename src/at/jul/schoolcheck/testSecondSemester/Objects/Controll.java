package at.jul.schoolcheck.testSecondSemester.Objects;

import java.util.Scanner;

public class Controll {
    private String status;
    private Watertank tank;
    private Beans coffeeBeans;

    public Controll(Watertank tank, Beans coffeeBeans) {
        this.status = "OFF";
        this.tank = tank;
        this.coffeeBeans = coffeeBeans;
    }

    private void turnOnMachine(){
        if(this.status == "ON"){
            System.out.println("Maschine bereits eingeschaltet");
        }else if(this.status == "OFF"){
            this.status = "ON";
            System.out.println("Maschine wurde eingeschaltet.");
        }else{
            System.out.println("ERROR OCCURED");
            return;
        }
    }

    private int howMuchBones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viel gramm Bohnen wollen Sie? Achtung nicht mehr wie 10g wählen");
        int howMuchBones = scanner.nextInt();


        if(howMuchBones>10){
            System.out.println("Error zu viele Bohnen");
            return 0;
        }
        if (howMuchBones>0 &&howMuchBones <=10){
            if(howMuchBones> coffeeBeans.getVolumeOfBonesTank()){
                System.out.println("Musst den Tank auffüllen");
                int fillUpTank=scanner.nextInt();
                coffeeBeans.fillBonesTank(fillUpTank);
            }
            for (int i = 1; i < 11; i++) {
                if(howMuchBones==i){
                    return howMuchBones;
                }
            }
        }
        return howMuchBones;
    }

    private int howMuchWater(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viel ml Wasser wollen Sie? Achtung nicht mehr wie 400ml und nicht weniger als 20ml wählen");
        int howMuchWater = scanner.nextInt();

        if(howMuchWater>400||howMuchWater<20){
            System.out.println("Error");
            return 0;
        }else{
            if(howMuchWater> tank.getVolumeOfTank()){
                System.out.println("Musst den Tank auffüllen");
                int fillUpTank=scanner.nextInt();
                tank.fillWaterTank(fillUpTank);
            }
            for (int i = 20; i < 400; i++) {
                if(howMuchWater==i){
                    return howMuchWater;
                }
            }
        }
        return howMuchWater;
    }

    public void makeCoffee(){
        turnOnMachine();
        int bones = howMuchBones();
        int water = howMuchWater();
        if(bones == 0 || water == 0){
            System.out.println("Kann nicht zubereiten");
            makeCoffee();
        }else {
            System.out.println("Ihr Kaffee hat " + water + "ml Wasser und " + bones + "g Bohnen");
            coffeeBeans.setVolumeOfBonesTank(bones);
            tank.setVolumeOfTank(water);
        }
    }
    public void shutDownMachine(){
        this.status = "OFF";
        System.out.println("wurde ausgeschaltet");
    }
}
