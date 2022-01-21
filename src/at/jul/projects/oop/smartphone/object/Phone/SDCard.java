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

    public void saveFile(PhoneFiles phoneFiles){
        this.phoneFiles.add(phoneFiles);
    }
    public int getCapacity(){
        int freeSpace = this.capacity;
        for (int i = 0; i < phoneFiles.size(); i++) {
            freeSpace =freeSpace-phoneFiles.get(i).getSize();
        }
        return freeSpace;
    }

    public List<PhoneFiles> getPhoneFiles() {
        return phoneFiles;
    }
}
