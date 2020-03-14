package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle(3, 4);
        //When
        collector.addFigure(triangle);
        //Then
        Assert.assertEquals(triangle, collector.shapes.get(0));
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(4);
        collector.shapes.add(circle);
        //When
        Shape result = collector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> shapes = new ArrayList<>();
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square(4.0);
        collector.addFigure(square);
        //When
        boolean result = collector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapes.size());
    }
}

