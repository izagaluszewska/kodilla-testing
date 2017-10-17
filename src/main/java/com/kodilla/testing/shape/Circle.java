package com.kodilla.testing.shape;

public class Circle implements Shape {
    double radius;
    static double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return getClass().getName();
    }

    public Double getField() {
        return pi * radius * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
