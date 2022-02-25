package at.jul.projects.oop.musicbox;

import at.jul.projects.oop.musicbox.exceptions.MagazineFullException;
import at.jul.projects.oop.musicbox.objects.*;

public class MusicboxMain {
    public static void main(String[] args) {
        Title eminemLoseYourself = new Title("Lose Yourself", 5.20);
        Title eminemTillICollapse = new Title("Till I Collapse", 4.57);
        Title tupacAmbitionz= new Title("Ambitionz as a Rida", 4.38);

        Plate tupac = new Plate("Tupac Album","TP");
        Plate eminem = new Plate("Eminem Album", "EE");
        Plate nn = new Plate("ni","nn");

        Magazin magazin = new Magazin("Magazin");
        Player player = new Player("Player",magazin);

        tupac.addTitle(tupacAmbitionz);
        eminem.addTitle(eminemLoseYourself);
        eminem.addTitle(eminemTillICollapse);

        try {
            magazin.addRecord(eminem);
            magazin.addRecord(tupac);
            magazin.addRecord(tupac);
            magazin.addRecord(tupac);
        } catch (MagazineFullException e) {
            System.out.println("Magazin ist voll" + e.getMessage() + "."+ e.getCode());
        }

        player.loadRecord(eminem);

        /*
        System.out.println(magazin.getSumOfMusic());

        magazin.removeRecord(eminem);
        */
    }
}
