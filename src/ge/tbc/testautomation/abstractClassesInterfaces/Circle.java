package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figure implements IResizable, IValidFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (!validateFigure()) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackageName());
    }

    /** Size = radius, so doubling the size doubles the radius. */
    @Override
    public void doubleSize() {
        radius *= 2;
    }

    @Override
    public void customSize(double byValue) {
        if (byValue <= 0) {
            throw new IllegalArgumentException("COEFFICIENT MUST BE POSITIVE");
        }
        radius *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }
}
