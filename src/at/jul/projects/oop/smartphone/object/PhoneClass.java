package at.jul.projects.oop.smartphone.object;

import at.jul.projects.oop.smartphone.object.Phone.*;

import java.util.ArrayList;
import java.util.List;

public class PhoneClass {
private String color;
private SDCard sdCard;

    public PhoneClass(String color, SDCard sdCard) {
        this.color = color;
        this.sdCard = sdCard;
    }


    public List getAllFilesInformation(){
        List<PhoneFile> informationFiles = sdCard.getPhoneFiles();

        List newListFiles = new ArrayList<String>();
        for (int i = 0; i < informationFiles.size(); i++) {
            newListFiles.add(informationFiles.get(0).getInfo());
        }
        return newListFiles;
    }

    public int freeSpace(){
        return sdCard.getCapacity();
    }

    public void saveFile(PhoneFile phoneFile){
        sdCard.saveFile(phoneFile);
    }

}
