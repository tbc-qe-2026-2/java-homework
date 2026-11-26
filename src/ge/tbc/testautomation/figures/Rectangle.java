package ge.tbc.testautomation.figures;

public record Rectangle(
        double width,
        double height
) {

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + width + "x" + height + ", area=" + getArea() + "}";
    }
}
