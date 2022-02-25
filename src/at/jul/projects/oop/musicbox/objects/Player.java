package at.jul.projects.oop.musicbox.objects;


import java.util.Scanner;

public class Player {
    private String name;
    private Magazin magazin;

    public Player(String name, Magazin magazin) {
        this.name = name;
        this.magazin = magazin;
    }
    public void loadRecord(Plate plate){
        Plate plateToLoad = magazin.searchPlate(plate.getTitle());

        System.out.println("Die Platte " + plateToLoad.getTitle() + " wurde eingelegt");
        playPlate(plateToLoad);
    }

    private void playPlate(Plate plate){
        Scanner scanner = new Scanner(System.in);
        int size = magazin.getPlates().size();
        System.out.println("Welchen Titel auf der Platte wollen sie spielen? Die Platte hat so viele Titel " + size );
        int numberOfTitle = scanner.nextInt() -1;
        if (numberOfTitle <= size){
            try {
                plate.playPlate(numberOfTitle);
            }catch(Exception e){
                System.out.println("Fehler");
            }
        }
    }
}
