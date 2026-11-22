package ge.tbc.testautomation.javaoop.figures;

public class Circle {

    public static int numberOfCircleInstances;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
