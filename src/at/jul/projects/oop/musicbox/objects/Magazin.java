package at.jul.projects.oop.musicbox.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazin {
    private String name;

    private List<Plate> plates;

    public Magazin(String name) {
        this.name = name;
        this.plates = new ArrayList<>();
    }

    public void addRecord(Plate plate){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Neue Platte designen = 1; Vorhandene einsetzten = 2");
        int desideWhichWay = scanner.nextInt();

        if(desideWhichWay == 1){
            System.out.println("Wie viele Titel hat die Platte?");
            int amountOfTitles = scanner.nextInt();

            for (int i = 0; i < amountOfTitles; i++) {
                System.out.println("Name");
                String nameOfTitle = scanner.next();
                System.out.println("Länge");
                double lenghtOfTitle = scanner.nextInt();
                Title title = new Title(nameOfTitle,lenghtOfTitle);
                plate.addTitle(title);
            }
            plates.add(plate);
        }else if (desideWhichWay == 2){
            plates.add(plate);
        }else{
            System.out.println("Fehler");
            return;
        }

    }



}
