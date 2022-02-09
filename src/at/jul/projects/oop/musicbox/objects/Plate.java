package at.jul.projects.oop.musicbox.objects;

import java.util.ArrayList;
import java.util.List;

public class Plate {
    private String title;
    private String id;

    private List<Title> recordTitles;

    public Plate(String title, String id) {
        this.title = title;
        this.id = id;
        this.recordTitles = new ArrayList<>();
    }

    public double getSumOfMusic(){
        double sumOfPlateMusic = 0;
        for (int i = 0; i < recordTitles.size(); i++) {
            sumOfPlateMusic += recordTitles.get(i).getLength();
        }
        return sumOfPlateMusic;
    }

    public void playPlate(int numberOfTitle){
        System.out.print("Spiele: ");
        recordTitles.get(numberOfTitle).getInfo();
    }

    public void addTitle(Title title){
        recordTitles.add(title);
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public void getPlateInfo(){
        for (int i = 0; i < recordTitles.size(); i++) {
            recordTitles.get(i).getInfo();
        }
    }

    public int numberOfTitles(Plate plate){
       return plate.recordTitles.size();
    }

}
