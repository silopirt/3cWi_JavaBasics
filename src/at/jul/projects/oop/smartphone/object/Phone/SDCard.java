package at.jul.projects.oop.smartphone.object.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;

    private List<PhoneFiles> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }
}
