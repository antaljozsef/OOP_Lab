package rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double area(){
        return this.width * this.length;
    }

    public double perimeter(){
        return 2 * this.length + 2 * this.width;
    }
}
