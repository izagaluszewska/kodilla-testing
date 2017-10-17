package com.kodilla.testing.shape;

public class Square implements Shape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return getClass().getName();
    }

    public Double getField() {
        return sideLength * sideLength;
    }

    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
