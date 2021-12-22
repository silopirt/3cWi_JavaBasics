package at.jul.projects.oop.geometric.figures;

public class Figure {
    private String nameOfFigure;


    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public Figure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }
    public int Area(int a, int b){
        int area= a*b;
        return area;
    }
}