package at.jul.projects.oop.musicbox.objects;

public class Title {
    private String name;
    private double length;

    public Title(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void getInfo(){
        System.out.println("Name: "+ name + ", Länge: "+ length);
    }
}
