package com.thoughtworks.rectangle;

public class Polygon {

    private final double length;
    private final double breadth;

    private Polygon(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Polygon rectangle(double length, double breadth) {
        return new Polygon(length, breadth);
    }

    public static Polygon square(double side) {
        return new Polygon(side, side);
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

}
