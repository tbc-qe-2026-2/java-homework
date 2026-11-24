package ge.tbc.testautomation.figures;

public sealed class Figure permits Rectangle, Triangle {

    public double getArea() {
        return -1.0;
    }

    public double getPerimeter() {
        return -1.0;
    }
}
