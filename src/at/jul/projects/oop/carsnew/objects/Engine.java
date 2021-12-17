package at.jul.projects.oop.carsnew.objects;

public class Engine {
    public enum TYPE {DIESEL, GAS};

    private TYPE type;

    public Engine(TYPE type) {
        this.type = type;
    }
}
