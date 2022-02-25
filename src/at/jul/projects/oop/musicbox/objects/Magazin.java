package at.jul.projects.oop.musicbox.objects;

import java.util.ArrayList;
import java.util.List;


public class Magazin {
    private String magazinName;


    private List<Plate> plates;

    public Magazin(String magazinName) {
        this.magazinName = magazinName;

        this.plates = new ArrayList<>();
    }

    public void addRecord(Plate plate){
        if(plates.size() >2){
            System.out.println("Magazin ist voll");
        }else{
            plates.add(plate);
            System.out.println("Anzahl an Platten im Magazin: " + plates.size());
        }
    }

    public void removeRecord(Plate plate){
        for (int i = 0; i < plates.size(); i++) {
            if(plates.get(i).getId() == plate.getId()&&plates.get(i).getTitle() == plate.getTitle()){
                plates.remove(i);
                System.out.println("Platte wurde gelöscht " + plates.size());
            }
        }
    }

    public double getSumOfMusic(){
        double sumOfMusic = 0;
        for (int i = 0; i < plates.size(); i++) {
            sumOfMusic += plates.get(i).getSumOfMusic();
        }
        return sumOfMusic;
    }

    public Plate searchPlate(String search){
        int decider = -1;

        for (int i = 0; i < plates.size(); i++) {
            if(plates.get(i).getTitle() == search){
                System.out.println("Die Platte " + plates.get(i).getTitle() +" wurde gefunden");
                decider = i;
                return plates.get(decider);
            }else{
                System.out.println("Keine Platte gefunden.");
            }
        }
        return plates.get(decider);
    }

    public List<Plate> getPlates() {
        return plates;
    }
}
