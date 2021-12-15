package at.jul.projects.oop.Car.objects;

public class Tyres {
    private int tyreProfile;
    private int size;

    public Tyres(int tyreProfile, int size) {
        this.tyreProfile = tyreProfile;
        this.size = size;
    }

    public int getTyreProfile() {
        return tyreProfile;
    }

    public void setTyreProfile(int tyreProfile) {
        this.tyreProfile = tyreProfile;
    }

    public int getSize() {
        return size;
    }

}