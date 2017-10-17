package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double baseLength;
    double highLength;

    public Triangle(double baseLength, double highLength) {
        this.baseLength = baseLength;
        this.highLength = highLength;
    }

    public String getShapeName() {
        return getClass().getName();
    }

    public Double getField() {
        return baseLength * highLength / 2;
    }

    public String toString() {
        return "Triangle{" +
                "baseLength=" + baseLength +
                ", highLength=" + highLength +
                '}';
    }
}
