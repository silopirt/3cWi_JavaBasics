package at.jul.projects.oop.smartphone;

import at.jul.projects.oop.smartphone.objects.phoneobjects.SDCard;
import at.jul.projects.oop.smartphone.objects.phoneobjects.sdcardfiles.PhoneFile;

public class Main {
    public static void main(String[] args) {
        PhoneFile phoneFile = new PhoneFile("Image",".jpg",1);
        PhoneFile phoneFile2 = new PhoneFile("Image1",".jpg",1);

        SDCard sdCard = new SDCard(1000);

        sdCard.setPhoneFiles(phoneFile);
        phoneFile.getInfo();
        System.out.println(sdCard.getCapacity());

    }
}
