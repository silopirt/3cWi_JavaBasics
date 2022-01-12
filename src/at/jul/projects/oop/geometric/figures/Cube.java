package at.jul.projects.oop.geometric.figures;

import at.jul.projects.oop.geometric.Figure;

public class Cube extends Figure {
    private int a;
    private int b;
    private int c;

    public Cube(String nameOfFigure, int a, int b, int c) {
        super(nameOfFigure);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getArea() {
        return a*b*c;
    }
}
