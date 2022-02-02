package at.jul.projects.oop.camera.objects;


import java.util.Date;

public class PhotoFiles {
    private String name;
    private Date date;
    private int size;

    public PhotoFiles(String name, Date date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public void getFileInfo(){
        System.out.println("Filename: " + this.name + ", Aufnahmedatum: "+ this.date +", Größe: "+ this.size);
    }

    public int getSize() {
        return size;
    }
}
