package at.jul.projects.oop.smartphone.object;

import at.jul.projects.oop.smartphone.object.Phone.*;

import java.util.ArrayList;
import java.util.List;

public class PhoneClass {
private String color;
private SDCard sdCard;
private SIM sim;
private Camera camera;

    public PhoneClass(String color, SDCard sdCard, SIM sim, Camera camera) {
        this.color = color;
        this.sdCard = sdCard;
        this.sim = sim;
        this.camera = camera;
    }


    public List getAllFilesInformation(){
        List<PhoneFile> informationFiles = sdCard.getPhoneFiles();

        List newListFiles = new ArrayList<String>();
        for (int i = 0; i < informationFiles.size(); i++) {
            newListFiles.add(informationFiles.get(i).getInfo());
        }
        return newListFiles;
    }

    public int freeSpace(){
        return sdCard.getCapacity();
    }

    public void saveFile(PhoneFile phoneFile){
        sdCard.saveFile(phoneFile);
    }

    public void makeCall(String numberSim){
        sim.makeCall(numberSim);
    }

    public void takePicture(){
        sdCard.saveFile(camera.makePicture());
    }

}
