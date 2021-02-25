package car;

import java.awt.*;
import java.util.SplittableRandom;

public class Car {
    private String carBrand;
    private String carType;
    /**
     * private Color color (enum)
     * private FuelType fuel
     */
    private int numberOfKilometers;
    private int numberOfPassengers;
    private int yearOfManufacture;
    private int speed;

    public Car(String carBrand, String carType, int numberOfKilometers, int numberOfPassengers, int yearOfManufacture, int speed) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.numberOfKilometers = numberOfKilometers;
        this.numberOfPassengers = numberOfPassengers;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
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

    /**
     public Color getColor(){
     return this.color;
     }

     public void setColor(Color color){
     this.color = color;
     */

    /**
     * public FuelType getFuel(){
     * return this.fuel;
     * }
     * <p>
     * public void setFuel(FuelType fuel){
     * this.fuel = fuel;
     * }
     */

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

    @Override

    public String toString() {
        return "This car is a " + this.carBrand + " " + this.carType + "car which was manufactured in " + this.yearOfManufacture + " and the number of kilometers traveled is: " + this.numberOfKilometers;
    }
}
