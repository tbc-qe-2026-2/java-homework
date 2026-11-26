package ge.tbc.testautomation.figures.comparators;

import ge.tbc.testautomation.figures.Rectangle;

import java.util.Comparator;
import java.util.Objects;

public class ReverseRectangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        Objects.requireNonNull(r1);
        Objects.requireNonNull(r2);
        return Double.compare(r2.getArea(), r1.getArea());
    }
}
