package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.figures.Circle;

public class Main {

    public static void main(String[] args) {
        try {
            new Circle(-1);
        } catch (RadiusException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            for (int radius = 1; radius <= 5; radius++) {
                new Circle(radius);
            }
        } catch (LimitException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
