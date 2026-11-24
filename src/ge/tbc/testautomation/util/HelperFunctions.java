package ge.tbc.testautomation.util;

import ge.tbc.testautomation.figures.Rectangle;

import java.util.Objects;

public final class HelperFunctions {

    public static void compareRectangles(
            final Rectangle r1,
            final Rectangle r2
    ) {
        Objects.requireNonNull(r1);
        Objects.requireNonNull(r2);

        double p1 = r1.getPerimeter();
        double p2 = r2.getPerimeter();

        String operator = (p1 > p2) ? ">" : (p1 == p2) ? "=" : "<";

        System.out.printf("parameter 1 %s parameter 2%n", operator);
    }
}
