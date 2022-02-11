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
    public void addPlate(Plate plate){
        magazin.addRecord(plate);
    }

    public void play(int numberOfTitle, Plate plate){
        if(numberOfTitle> plate.numberOfTitles(plate)){
            System.out.println("Zu hohe Nummer für die Titel");
            return;
        }
        Plate plateToPlay = loadRecord(plate);
        plateToPlay.playPlate(numberOfTitle);
    }
    public void removeRec(Plate plate){
        magazin.removeRecord(plate);
    }
    public void getSumOfMusic(){
        magazin.getSumOfMusic();
    }
    public void getInfo(){
        magazin.getInfo();
    }
    public void searchRec(Plate plate){
        magazin.searchPlate(plate);
    }
}
