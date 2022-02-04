package at.jul.projects.oop.musicbox;

import at.jul.projects.oop.musicbox.objects.Magazin;
import at.jul.projects.oop.musicbox.objects.Plates;
import at.jul.projects.oop.musicbox.objects.Title;

public class MainMusicBox {
    public static void main(String[] args) {
        Title title = new Title(4);
        Title title1 = new Title(5);

        Plates plate = new Plates("try","T1");
        Plates plate1 = new Plates("try1","T2");

        Magazin magazin = new Magazin("ModelOne");

        plate.addTitle(title);
        plate.addTitle(title1);

        plate1.addTitle(title);
        plate1.addTitle(title1);

        magazin.addRecord(plate);
        magazin.addRecord(plate1);


    }
}
