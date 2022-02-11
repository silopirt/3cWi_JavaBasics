package at.jul.projects.oop.musicbox;

import at.jul.projects.oop.musicbox.objects.*;

import java.util.Scanner;

public class MusicboxMain {
    public static void main(String[] args) {
        Title titleOne = new Title("Godzilla", 3.3);
        Title titleTwo = new Title("Darkness", 5.37);

        Plate plateOne = new Plate("Music to be murdered by", "E5");
        Plate plateTwo = new Plate("jkjkj", "r2");

        Magazin magazin = new Magazin("Mainplayer");

        Player player = new Player(magazin);

        plateOne.addTitle(titleOne);
        plateOne.addTitle(titleTwo);

        magazin.addRecord(plateOne);
        magazin.addRecord(plateTwo);

        magazin.searchPlate(plateOne);
        magazin.removeRecord(plateTwo);
        magazin.searchPlate(plateTwo);


    }
}
