package at.jul.projects.oop.camera;

import at.jul.projects.oop.camera.objects.*;


import java.util.Date;

public class MainCamera {
    public static void main(String[] args) {
        PhotoFiles photoFiles = new PhotoFiles("IMG_123456", new Date(),8);

        SDCard sdCardBig = new SDCard(256);
        SDCard sdCardMedium = new SDCard(128);
        SDCard sdCardSmall = new SDCard(64);

        Producer producerSony = new Producer("Sony","Japan");
        Producer producerGoPro = new Producer("GoPro","United States of America");

        Objectiv objectivSony = new Objectiv("50mm", producerSony);
        Objectiv objectivGoPro = new Objectiv("50mm", producerGoPro);

        Camera cameraSony = new Camera("Black","Sony_XY",4,300,sdCardMedium,producerSony);
        Camera cameraGoPro = new Camera("Black","GoPro_XY",5,400,sdCardBig,producerGoPro,objectivGoPro);


        cameraGoPro.takePicture();
        System.out.println(cameraGoPro.freeSpace());
        cameraGoPro.getInfo();



    }
}
