package at.jul.projects.oop.geometric;

public class Figure {
    private String nameOfFigure;


    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public Figure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }
    public int getArea(int a, int b){
        int area= a*b;
        return area;
    }
}