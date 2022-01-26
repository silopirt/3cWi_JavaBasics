package at.jul.projects.oop.smartphone;

import at.jul.projects.oop.smartphone.object.Phone.*;
import at.jul.projects.oop.smartphone.object.PhoneClass;

public class MainPhone {
    public static void main(String[] args) {

        SDCard sdCard = new SDCard(100);


        PhoneFile phoneFiles = new PhoneFile("Image",".jpg",3);
        PhoneFile phoneFiles2 = new PhoneFile("Image2",".jpg",3);

        PhoneClass phoneClass = new PhoneClass("rot",sdCard);

        phoneClass.saveFile(phoneFiles);
        phoneClass.saveFile(phoneFiles2);


        System.out.println(phoneClass.getAllFilesInformation());

    }
}
