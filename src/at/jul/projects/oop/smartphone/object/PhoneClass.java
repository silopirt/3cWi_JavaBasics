package at.jul.projects.oop.smartphone.object;

import at.jul.projects.oop.smartphone.object.Phone.SDCard;

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

        List informationFiles = sdCard.getPhoneFiles();
        List newListFiles = new ArrayList<>();
        for (int i = 0; i < informationFiles.size(); i++) {

        }
        return informationFiles;

    }
}
