package at.jul.projects.oop.smartphone.object.Phone;

public class PhoneFile {
    private String name;
    private String extension;
    private int size;

    public PhoneFile(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public String getInfo(){
        String output = (this.name + this.extension + " Größe: " + this.size).toString();
        return output;
    }

    public int getSize() {
        return size;
    }

}
