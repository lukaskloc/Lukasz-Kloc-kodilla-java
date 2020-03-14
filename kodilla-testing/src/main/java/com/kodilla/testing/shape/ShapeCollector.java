package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public Shape getFigure(int n) {
        return shapes.get(n);
    }
    public boolean removeFigure(Shape shape) {
        shapes.remove(shape);
        return true;
    }
}
