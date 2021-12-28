package at.jul.projects.oop.geometric.figures;

import at.jul.projects.oop.geometric.Figure;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(String nameOfFigure, int a, int b) {
        super(nameOfFigure);
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea(int a, int b) {
        return a*b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
