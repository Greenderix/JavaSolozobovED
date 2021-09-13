package Practic3.first;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        this.color = "RED";
        this.filled = true;
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length) {
        this.color = "RED";
        this.filled = true;
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    double getArea() {
        return width*length;
    }
    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}