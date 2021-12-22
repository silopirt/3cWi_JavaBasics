package at.jul.projects.oop.geometric.figures;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(String nameOfFigure, int a, int b) {
        super(nameOfFigure);
        this.a = a;
        this.b = b;
    }
}
