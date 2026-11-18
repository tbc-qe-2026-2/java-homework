package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("ინსტანსების რაოდენობა: " + Circle.numberOfCircleInstances);

        Circle c2 = new Circle(10.2);
        System.out.println("ინსტანსების რაოდენობა: " + Circle.numberOfCircleInstances);

        Circle c3 = new Circle(3.5);
        System.out.println("ინსტანსების რაოდენობა: " + Circle.numberOfCircleInstances);

        Circle c4 = new Circle(7.8);
        System.out.println("ინსტანსების რაოდენობა: " + Circle.numberOfCircleInstances);

        Circle c5 = new Circle(12.0);
        System.out.println("ინსტანსების რაოდენობა: " + Circle.numberOfCircleInstances);

        String info1 = Util.circleToString(c1);
        System.out.println(info1);

        String info2 = Util.circleToString(c2);
        System.out.println(info2);

        String info3 = Util.circleToString(c3);
        System.out.println(info3);

        String info4 = Util.circleToString(c4);
        System.out.println(info4);

        String info5 = Util.circleToString(c5);
        System.out.println(info5);
    }
}
