package ge.tbc.testautomation.oop.figures;

import java.util.Objects;

public record Circle(
        double radius
) implements Comparable<Circle> {

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }

    @Override
    public int compareTo(Circle other) {
        Objects.requireNonNull(other);
        if (this.radius > other.radius) {
            return 1;
        } else if (this.radius < other.radius) {
            return -1;
        }
        return 0;
    }
}
