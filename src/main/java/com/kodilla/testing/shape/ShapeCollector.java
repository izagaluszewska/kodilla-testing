package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
        }
    }

    public Shape getFigure(int n) {
        Shape figure = null;
        if (n >= 0 && n < shapes.size()) {
            figure = shapes.get(n);
        }
        return figure;
    }

    public void showFigures() {
        System.out.println(shapes.toArray());
    }

    public int getFigureNumber() {
        return shapes.size();
    }
}
