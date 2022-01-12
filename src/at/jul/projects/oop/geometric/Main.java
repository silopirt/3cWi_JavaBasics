package at.jul.projects.oop.geometric;

import at.jul.projects.oop.geometric.figures.*;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle("Rectangle",4,5);
        Circle circleOne = new Circle("Circle", 3);
        Cube cubeOne = new Cube("Cube",2,2,3);
        Square squareOne = new Square("Square", 5);



        System.out.println(rectangleOne.getArea() + " " + rectangleOne.getNameOfFigure());
        System.out.println(circleOne.getArea() +" " + circleOne.getNameOfFigure());
        System.out.println(squareOne.getArea() +" " + squareOne.getNameOfFigure());
        System.out.println(cubeOne.getArea()+ " " +cubeOne.getNameOfFigure());


    }
}
