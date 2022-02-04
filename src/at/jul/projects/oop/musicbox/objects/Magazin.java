package at.jul.projects.oop.musicbox.objects;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private final String modelOfMag;

    private final List<Plates> plates;

    public Magazin(String magazinModel) {
        this.modelOfMag = magazinModel;

        this.plates = new ArrayList<>();
    }

    public void addRecord(Plates plate) {
        if (plates.size() > 50) {
            System.out.println("Magazin ist voll!");
        } else {
            this.plates.add(plate);
        }
    }

    public void removeRecord(Plates plate) {
        for (int i = 0; i < plates.size(); i++) {
            if (plate.getTitleName() == plates.get(i).getTitleName()) {
                plates.remove(i);
            } else {
                System.out.println("Konnte Platte nicht finden. Es wurde nichts gelöscht.");
            }
        }
    }

    public int sumOfMusic() {
        int lengthOfMusicWhichIsPlayed = 0;
        for (int i = 0; i < plates.size(); i++) {
            lengthOfMusicWhichIsPlayed += plates.get(i).getLenghtOfPlate();
        }
        return lengthOfMusicWhichIsPlayed;
    }

    public Plates searchRecord(String search) {
        for (int i = 0; i < plates.size(); i++) {
            if (search == plates.get(i).getTitleName() || search == plates.get(i).getId()) {
                return plates.get(i);
            }
        }
    }

    public void playMusic(String search,int min){
        Plates searchedPlate = searchRecord(search);

        searchedPlate.
    }
}
