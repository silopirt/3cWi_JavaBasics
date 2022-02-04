package at.jul.projects.oop.musicbox.objects;

import java.util.ArrayList;
import java.util.List;

public class Plates {
    private final String titleName;
    private final String id;

    private final List<Title> titles;


    public Plates(String titleName, String id) {
        this.titleName = titleName;
        this.id = id;

        this.titles = new ArrayList<>();
    }

    public String getTitleName() {
        return titleName;
    }

    public String getId() {
        return id;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public int getLenghtOfPlate() {
        int plateLenght = 0;
        for (int i = 0; i < titles.size(); i++) {
            plateLenght += titles.get(i).getLength();
        }
        switch (plateLenght) {
            case 0:
                System.out.println("Leere Platte");
                return plateLenght;
            default:
                return plateLenght;
        }

    }
}
