package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4.0, 6.0);
        Rectangle rect2 = new Rectangle(5.0, 5.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, 2.5);

        System.out.println(rect1 + " -> area: " + rect1.getArea() + ", perimeter: " + rect1.getPerimeter());
        System.out.println(triangle + " -> area: " + triangle.getArea() + ", perimeter: " + triangle.getPerimeter());

        HelperFunctions.compareRectangles(rect1, rect2);
    }
}
