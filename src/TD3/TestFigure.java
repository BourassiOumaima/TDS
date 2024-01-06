package TD3;

import java.awt.*;

public class TestFigure {
    public static void main(String[] args) {
        // class disque
        Point c = new Point(2, 3);
        double r = 5.0;

        Disque d1 = new Disque();
        Disque d2 = new Disque(c,r);
        Disque d3 = new Disque(c, r, "Disque");

        System.out.println("Disque 1:\n" + d1);
        System.out.println("\nDisque 2:\n" + d2);
        System.out.println("\nDisque 3:\n" + d3);

        //class rectangle
        double lo = 4.0;
        double la = 3.0;

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(lo, la);
        Rectangle rectangle3 = new Rectangle(lo, la, "Rectangle");

        System.out.println("\nRectangle 1:\n" + rectangle1);
        System.out.println("\nRectangle 2:\n" + rectangle2);
        System.out.println("\nRectangle 3:\n" + rectangle3);
    }
}

