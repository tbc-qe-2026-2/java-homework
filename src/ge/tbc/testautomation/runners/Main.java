package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.Figure;
import ge.tbc.testautomation.abstractClassesInterfaces.Triangle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.TriangleException;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("--- Figure (polymorphism) ---");
        Figure[] figures = {circle, triangle};
        for (Figure figure : figures) {
            System.out.printf("%s: area=%.2f, length=%.2f%n",
                    figure.getClass().getSimpleName(), figure.getArea(), figure.getLength());
            figure.printPackageName();
        }

        System.out.println("\n--- IResizable ---");
        IResizable[] resizables = {circle, triangle};
        for (IResizable resizable : resizables) {
            resizable.doubleSize();
        }
        System.out.printf("after doubleSize: circle r=%.2f, triangle sides=%.1f/%.1f/%.1f%n",
                circle.getRadius(), triangle.getA(), triangle.getB(), triangle.getC());
        for (IResizable resizable : resizables) {
            resizable.customSize(0.5);
        }
        System.out.printf("after customSize(0.5): circle r=%.2f, triangle sides=%.1f/%.1f/%.1f%n",
                circle.getRadius(), triangle.getA(), triangle.getB(), triangle.getC());

        System.out.println("\n--- IValidFigure ---");
        IValidFigure[] validFigures = {circle, triangle};
        for (IValidFigure validFigure : validFigures) {
            System.out.println(validFigure.getClass().getSimpleName() + " valid: " + validFigure.validateFigure());
        }

        System.out.println("\n--- Validation on creation ---");
        try {
            new Circle(-5);
        } catch (RadiusException e) {
            System.out.println("Circle: " + e.getMessage());
        }
        try {
            new Triangle(1, 2, 10);
        } catch (TriangleException e) {
            System.out.println("Triangle: " + e.getMessage());
        }
    }
}
