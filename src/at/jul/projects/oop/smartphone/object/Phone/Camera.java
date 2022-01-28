package at.jul.projects.oop.smartphone.object.Phone;

import java.util.Scanner;

public class Camera {
    private String resolution;
    private PhoneFile phoneFile;


    public Camera(String resolution) {
        this.resolution = resolution;
    }
    public PhoneFile makePicture(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("geben sie den filenamen ein.");
        String getNewFileName = scanner.next();
        System.out.println("geben sie die Größe ihrer Datei ein.");
        int getFileSize = scanner.nextInt();
        PhoneFile phoneFile = new PhoneFile(getNewFileName, ".jpg", getFileSize);

        return phoneFile;
    }
}
