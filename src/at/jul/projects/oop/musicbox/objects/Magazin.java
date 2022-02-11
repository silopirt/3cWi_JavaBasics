package at.jul.projects.oop.musicbox.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazin {
    private String name;

    private List<Plate> plates;


    public Magazin(String name) {
        this.name = name;
        this.plates = new ArrayList<>();
    }

    public void addRecord(Plate plate){
        if(plates.size() > 50){
            System.out.println("Spieler voll bitte lösche zuerst eine Platte");
            return;
        }else {
            plates.add(plate);
        }
    }
    public void removeRecord(Plate plate){
            Plate searchedPlate = searchPlate(plate);


            plates.remove(searchedPlate);
    }
    public void getSumOfMusic(){
        double sumOfMusic = 0;
        for (int i = 0; i < plates.size(); i++) {
            sumOfMusic +=plates.get(i).getSumOfMusic();
        }
        System.out.println(sumOfMusic);
    }

    public Plate searchPlate(Plate plate){
        if(plates.size() <= 0){
            System.out.println("Error");
            return null;
        }
        Plate plateBack = null;
        for (int i = 0; i < plates.size(); i++) {
            if(plates.get(i).getTitle() == plate.getTitle() || plates.get(i).getId() == plate.getId()){
                plateBack = plate;
                return plateBack;
            }else{
                System.out.println("Es wurde keine Platte gefunden oder diese ist leer.");
            }
        }
        return plateBack;
    }


    public void getInfo(){
        for (int i = 0; i < plates.size(); i++) {
            System.out.println(plates.get(i).getId() + " " + plates.get(i).getTitle());
            plates.get(i).getPlateInfo();
        }
    }

    public int getNumberOfPlates(){
        return plates.size();
    }

}
