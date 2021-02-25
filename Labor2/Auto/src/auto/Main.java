package auto;

public class Main {

    public static void main(String[] args) {
        Auto car1 = new Auto("Blue");
        System.out.println(car1.toString());

        car1.setSpeed(120);
        System.out.println("\n" + car1.toString());

        car1.setColor("Red");
        System.out.println("\n" + car1.toString());

        Auto car2 = new Auto("Yellow");
        car2.setSpeed(60);
        System.out.println("\n" + car2.toString());

    }
}
