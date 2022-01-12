package at.jul.projects.oop.geometric.figures;

import at.jul.projects.oop.geometric.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String nameOfFigure, int radius) {
        super(nameOfFigure);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return Math.toIntExact(Math.round(Math.PI))*(radius*radius);
    }

    public int getRadius() {
        return radius;
    }

}
