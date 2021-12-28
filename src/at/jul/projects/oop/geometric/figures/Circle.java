package at.jul.projects.oop.geometric.figures;

import at.jul.projects.oop.geometric.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String nameOfFigure, int radius) {
        super(nameOfFigure);
        this.radius = radius;
    }


}
