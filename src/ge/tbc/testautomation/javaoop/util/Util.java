package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Circle;

public class Util {

    public static String circleToString(final Circle circle) {
        return "[Circle: radius - %f]".formatted(circle.getRadius());
    }
}
