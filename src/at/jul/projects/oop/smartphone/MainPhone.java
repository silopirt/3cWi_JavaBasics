package at.jul.projects.oop.smartphone;

import at.jul.projects.oop.smartphone.object.Phone.*;
import at.jul.projects.oop.smartphone.object.PhoneClass;

public class MainPhone {
    public static void main(String[] args) {

        SDCard sdCard = new SDCard(100);


        PhoneFiles phoneFiles = new PhoneFiles("Image",".jpg",3);
        PhoneFiles phoneFiles2 = new PhoneFiles("Image2",".jpg",3);

        PhoneClass phoneClass = new PhoneClass("rot",sdCard);

        sdCard.saveFile(phoneFiles);
        sdCard.saveFile(phoneFiles2);

        phoneClass.getAllFilesInformation();

        System.out.println(sdCard.getCapacity());
    }
}
