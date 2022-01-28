package at.jul.projects.oop.smartphone;

import at.jul.projects.oop.smartphone.object.Phone.*;
import at.jul.projects.oop.smartphone.object.PhoneClass;

public class MainPhone {
    public static void main(String[] args) {

        SDCard sdCard = new SDCard(100);

        SIM sim = new SIM(1,"06501231234");

        Camera camera = new Camera("1920x1080");


        PhoneFile phoneFiles = new PhoneFile("Image",".jpg",3);
        PhoneFile phoneFiles2 = new PhoneFile("Image2",".jpg",3);

        PhoneClass phoneClass = new PhoneClass("rot",sdCard, sim,camera);

        phoneClass.saveFile(phoneFiles);
        phoneClass.saveFile(phoneFiles2);

        System.out.println(phoneClass.freeSpace());
        System.out.println(phoneClass.getAllFilesInformation());
        phoneClass.makeCall(sim.getNumber());
        phoneClass.takePicture();
        System.out.println(phoneClass.getAllFilesInformation());

    }
}
