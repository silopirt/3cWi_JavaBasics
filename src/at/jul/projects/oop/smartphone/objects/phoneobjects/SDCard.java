package at.jul.projects.oop.smartphone.objects.phoneobjects;

import at.jul.projects.oop.smartphone.objects.phoneobjects.sdcardfiles.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;

        this.phoneFiles = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }


    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public void setPhoneFiles(PhoneFile phoneFiles) {
        this.phoneFiles.add(phoneFiles);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
