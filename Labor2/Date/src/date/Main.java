package date;

public class Main {

    public static void main(String[] args) {
        DateUtil date = new DateUtil(2021, 2, 25);

        if (date.leapYear(2021) == true) {
            System.out.println("Leap year!");
        } else System.out.println("Not a leap year");

        if (date.isValidDate(2021, 2, 25) == true) {
            System.out.println("Valid date");
        } else System.out.println("Not a valid date");

        System.out.println("\n" + date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());

        System.out.println("\n" + date.toString());
    }
}
