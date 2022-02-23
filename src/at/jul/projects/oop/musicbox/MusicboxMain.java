package at.jul.projects.oop.musicbox;

import at.jul.projects.oop.musicbox.objects.*;

import java.util.Scanner;

public class MusicboxMain {
    public static void main(String[] args) {
        Title titleOne = new Title("Godzilla", 3.3);
        Title titleTwo = new Title("Darkness", 5.37);

        Plate plateOne = new Plate("Music to be murdered by", "E5");
        Plate plateTwo = new Plate("jkjkj", "r2");
<<<<<<< HEAD
        plateOne.addTitle(titleOne);
        plateOne.addTitle(titleTwo);
        Magazin magazin = new Magazin("Magazin_One");

        boolean application = true;
        while (application) {
            System.out.println("-- 1 für Platte hinzufügen \n" + "-- 2 für Platte löschen \n" + "-- 3 für Platte suchen \n" + "-- 4 für Summe der Musik \n"+"-- 5 für Task beenden");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection == 1) {
                magazin.addRecord(plateOne);
            } else if (selection == 2) {
                Plate removePlate = plateCreater(scanner);
                magazin.removePlate(removePlate);
            } else if (selection == 3) {
                Plate searchPlate = plateCreater(scanner);
                magazin.searchPlate(searchPlate);
            }else if(selection == 4){
                System.out.println(magazin.getSumOfMusic());
            }else {
                System.out.println("bye");
                application = false;
            }
        }
    }

    private static Plate plateCreater(Scanner scanner) {
        System.out.println("Name");
        String name = scanner.next();
        System.out.println("Id");
        String id = scanner.next();

        Plate newPlate = new Plate(name,id);

        return newPlate;
=======

        Magazin magazin = new Magazin("Magazin_One");

        magazin.addRecord(plateOne);


>>>>>>> 0d562d7defde7bf741225ff3d9bad34e9be03309
    }
}
