package at.jul.projects.oop.camera.objects;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int sizeOfSDCard;
    private List<PhotoFiles> photoFiles;

    public SDCard(int size) {
        this.sizeOfSDCard = size;
        this.photoFiles = new ArrayList<>();
    }

    public void saveFile(PhotoFiles photoFiles){
        this.photoFiles.add(photoFiles);
    }

    public int freeSpace(){
        int freeSpace = this.sizeOfSDCard;
        for (int i = 0; i < photoFiles.size(); i++) {
            freeSpace -= photoFiles.get(i).getSize();
        }
        return freeSpace;
    }
}
