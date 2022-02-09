package at.jul.projects.oop.musicbox.objects;

public class Player {
private Magazin magazin;

    public Player(Magazin magazin) {
        this.magazin = magazin;
    }

    public Plate loadRecord(Plate plate){
        Plate loadedPlate = magazin.searchPlate(plate);
        return loadedPlate;
    }

    public void play(int numberOfTitle, Plate plate){
        if(numberOfTitle> plate.numberOfTitles(plate)){
            System.out.println("Zu hohe Nummer für die Titel");
            return;
        }
        Plate plateToPlay = loadRecord(plate);
        plateToPlay.playPlate(numberOfTitle);
    }
}
