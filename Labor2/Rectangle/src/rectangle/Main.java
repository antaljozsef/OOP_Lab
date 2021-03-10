package rectangle;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        double length = 1 + rand.nextInt(10);
        double width = 1 + rand.nextInt(10) ;
        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Hossz: " + length);
        System.out.println("Szelesseg: " +width);

        System.out.println("Terulet: " + rectangle.area());
        System.out.println("Kerulet: " + rectangle.perimeter());
    }
}
