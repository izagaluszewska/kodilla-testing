package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void showTestNumber() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void showSpaceAfterTest() {
        System.out.println("Test end\n");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5, 10);
        shapeCollector.addFigure(triangle);
        //When
        int figuresNumber = shapeCollector.getFigureNumber();
        //Then
        Assert.assertEquals(1, figuresNumber);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5, 10);
        Square square = new Square(7);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);
        //When
        int figuresNumber = shapeCollector.getFigureNumber();
        //Then
        Assert.assertEquals(1, figuresNumber);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5, 10);
        shapeCollector.removeFigure(triangle);
        //When
        int figuresNumber = shapeCollector.getFigureNumber();
        //Then
        Assert.assertEquals(0, figuresNumber);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5, 10);
        shapeCollector.addFigure(triangle);
        //When
        Shape figure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, figure);
    }
}