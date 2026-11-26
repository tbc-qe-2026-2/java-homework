package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.oop.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.comparators.ReverseRectangleComparator;

import java.util.*;

public class ContainersAndComparing {

    public static void main() {
        // 2) ArrayList
        ArrayList<String> phones = new ArrayList<>();
        phones.add("555-542-231");
        phones.add("555-887-987");
        phones.add("555-161-143");
        phones.add("555-189-6667");

        // 3) ბეჭდვა იტერატორით
        Iterator<String> it = phones.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4) HashMap: სახელი -> ნომერი
        HashMap<String, String> book = new HashMap<>();
        book.put("გიორგი", phones.get(0));
        book.put("ნინო", phones.get(1));
        book.put("დავით", phones.get(2));
        book.put("მარიამი", phones.get(3));

        // 5) key-ები, რომელთა value შეიცავს რვიანს
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey());
            }
        }

        // 7) TreeSet
        TreeSet<Circle> treeSet = new TreeSet<>();
        double[] radii = {5, 2, 7, 3, 5, 1, 9, 2, 4, 7};
        for (double r : radii) {
            treeSet.add(new Circle(r));
        }
        System.out.println("TreeSet: " + treeSet);

        // 8) HashSet
        HashSet<Circle> hashSet = new HashSet<>();
        for (double r : radii) {
            hashSet.add(new Circle(r));
        }
        System.out.println("HashSet: " + hashSet);

        // 9) Rectangle ლისტის დალაგება reverse comparator-ით
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(5, 4));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(6, 2));

        rectangles.sort(new ReverseRectangleComparator());
        System.out.println(rectangles);
    }
}
