package at.jul.projects.oop.smartphone.objects.phoneobjects.sdcardfiles;

public class PhoneFile {
    private String name;
    private String extension;
    private int size;

    public PhoneFile(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public void getInfo(){
        System.out.println(this.name + this.extension + " " + this.size);
    }


    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }
}
