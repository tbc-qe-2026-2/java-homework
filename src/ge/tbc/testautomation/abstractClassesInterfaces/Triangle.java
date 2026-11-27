package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.TriangleException;

public class Triangle extends Figure implements IResizable, IValidFigure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!validateFigure()) {
            throw new TriangleException("TRIANGLE SIDES NOT VALID");
        }
    }

    public double getA() { return a; }

    public double getB() { return b; }

    public double getC() { return c; }

    /** Heron's formula. */
    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /** Perimeter. */
    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackageName());
    }

    /** Size = side length, so every side is doubled (the triangle stays similar). */
    @Override
    public void doubleSize() {
        customSize(2);
    }

    @Override
    public void customSize(double byValue) {
        if (byValue <= 0) {
            throw new IllegalArgumentException("COEFFICIENT MUST BE POSITIVE");
        }
        a *= byValue;
        b *= byValue;
        c *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }
}
