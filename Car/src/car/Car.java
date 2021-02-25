package car;

import java.awt.*;
import java.util.SplittableRandom;

public class Car {
    private String carBrand;
    private String carType;
    private Color color;
    private FuelType fuel;
    private int numberOfKilometers;
    private int numberOfPassengers;
    private int yearOfManufacture;
    private int speed;

    public Car(String carBrand, String carType, Color color, FuelType fuel, int numberOfKilometers, int numberOfPassengers, int yearOfManufacture, int speed) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.color = color;
        this.fuel = fuel;
        this.numberOfKilometers = numberOfKilometers;
        this.numberOfPassengers = numberOfPassengers;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public Car(String carBrand, String carType, int fuel, boolean family, int yearOfManufacture) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.speed = 0;
        this.numberOfKilometers = 0;
        this.yearOfManufacture = yearOfManufacture;

        switch (fuel) {
            case 0:
                this.fuel = FuelType.DIESEL;
                break;
            case 1:
                this.fuel = FuelType.PETROL;
                break;
            case 2:
                this.fuel = FuelType.GAS;
                break;
            default:
                this.fuel = FuelType.ELECTRIC;
        }

        if (family)
            this.numberOfPassengers = 5;
        else
            this.numberOfPassengers = 2;

        switch (Character.toUpperCase(carBrand.charAt(0))) {
            case 'R':
                this.color = Color.RED;
                break;
            case 'G':
                this.color = Color.GREEN;
                break;
            case 'B':
                this.color = Color.BLUE;
                break;
            case 'W':
                this.color = Color.WHITE;
                break;
            default:
                this.color = Color.BLACK;
        }
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return this.carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FuelType getFuel() {
        return this.fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public int getNumberOfKilometers() {
        return this.numberOfKilometers;
    }

    public void setNumberOfKilometers(int numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeSpeed(int speedIndicator) {
        if (this.speed + speedIndicator < 0)
            return;

        this.speed += speedIndicator;
    }

    public void moveCar(int length) {
        if (length < 0)
            return;

        if (this.numberOfKilometers + length > 200) {
            int remaining = this.numberOfKilometers + length - 200;
            this.resetMileage();
            this.numberOfKilometers = remaining;
        } else {
            this.numberOfKilometers += length;
        }

    }

    public void resetMileage() {
        this.numberOfKilometers = 0;
    }

    @Override

    public String toString() {
        String n;
        if (this.numberOfPassengers == 5)
            n = " family";
        else n = " two-seater";

        return "This car is a " + this.carBrand + " " + this.carType + n + " " + this.fuel + " car which was manufactured in " + this.yearOfManufacture + " and the number of kilometers traveled is: " + this.numberOfKilometers + ".";
    }
}
