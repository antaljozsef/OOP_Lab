package car;

public class Main {

    public static void main(String[] args) {
        Car auto = new Car("Mercedes", "E 220", Color.WHITE, FuelType.DIESEL, 210000, 5, 2001, 260);

        System.out.println(auto.getCarBrand());
        auto.setCarBrand("Audi");

        System.out.println(auto.getCarType());
        auto.setCarType("A4");

        System.out.println(auto.getColor());
        auto.setColor(Color.BLACK);

        System.out.println(auto.getFuel());
        auto.setFuel(FuelType.GAS);

        System.out.println(auto.getNumberOfKilometers());
        auto.setNumberOfKilometers(220000);

        System.out.println(auto.getNumberOfPassengers());
        auto.setNumberOfPassengers(4);

        System.out.println(auto.getYearOfManufacture());
        auto.setYearOfManufacture(2005);

        System.out.println(auto.getSpeed());
        auto.setSpeed(240);

        System.out.println(auto.toString());
    }
}
