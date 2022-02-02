package at.jul.projects.oop.camera.objects;

import java.util.Date;
import java.util.Scanner;

public class Camera {
    private String color;

    private String cameraName;

    private int pixel;
    private int weight;

    private SDCard sdCard;
    private Producer producer;
    private Objectiv objectiv;

    public Camera(String color, String cameraName, int pixel, int weight, SDCard sdCard, Producer producer) {
        this.color = color;
        this.cameraName = cameraName;
        this.pixel = pixel;
        this.weight = weight;
        this.sdCard = sdCard;
        this.producer = producer;
    }

    public Camera(String color, String cameraName, int pixel, int weight, SDCard sdCard, Producer producer, Objectiv objectiv) {
        this.color = color;
        this.cameraName = cameraName;
        this.pixel = pixel;
        this.weight = weight;
        this.sdCard = sdCard;
        this.producer = producer;
        this.objectiv = objectiv;
    }


    public void takePicture(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the file a name.");
        String fileName = scanner.next();

        int sizeOfFile = sizeOfFile();

        PhotoFiles photoFiles = new PhotoFiles(fileName,new Date(),sizeOfFile);

        System.out.println("Want to save the picture? 1 = YES, 2 = NO");
        int savePic = scanner.nextInt();

        if(savePic == 1){
            checkFileSize(photoFiles);
            checkIfYouWantToTakeAnotherPic(scanner);
        }else if(savePic == 2){
            checkIfYouWantToTakeAnotherPic(scanner);
        }
    }

    private void checkIfYouWantToTakeAnotherPic(Scanner scanner) {
        System.out.println("Want to take another picture? 1 = YES, 2 = NO");

        int wantAnotherPic = scanner.nextInt();
        if(wantAnotherPic == 1){
            takePicture();
        }else if(wantAnotherPic == 2){
            System.out.println("Thank you bye!");
        }else{
            System.out.println("Error");
            return;
        }
    }

    private int sizeOfFile() {
        int sizeOfFile = 0;
        if(this.pixel >= 5){
            sizeOfFile = 6;
        }else if(this.pixel <5 && this.pixel >=3){
            sizeOfFile = 4;
        }else if(this.pixel <3 && this.pixel >0){
            sizeOfFile = 2;
        }else{
            System.out.println("Error");
            takePicture();
        }
        return sizeOfFile;
    }

    public void checkFileSize(PhotoFiles photoFiles){
        if(freeSpace()< photoFiles.getSize()){
            System.out.println("Can not save! Not enough space!");
            return;
        }else if(freeSpace()< 50){
            System.out.println("Not much space available!");
            saveFile(photoFiles);
        }else if(freeSpace()>=50) {
            saveFile(photoFiles);
        }
    }

    private void saveFile(PhotoFiles photoFiles) {
        sdCard.saveFile(photoFiles);
        System.out.println("Successful saved!");
    }

    public int freeSpace(){
        return sdCard.freeSpace();
    }
}
