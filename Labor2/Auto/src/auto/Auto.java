package auto;

public class Auto {
    private String color;
    private int speed;

    public Auto(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override

    public String toString() {
        return "Car color: " + this.color + ", Car speed: " + this.speed;
    }
}