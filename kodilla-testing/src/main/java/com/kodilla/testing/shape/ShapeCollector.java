package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {
    
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapes=" + shapes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeCollector)) return false;

        ShapeCollector that = (ShapeCollector) o;

        return getShapes().equals(that.getShapes());
    }

    @Override
    public int hashCode() {
        return getShapes().hashCode();
    }

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
    public Iterator<Shape> showFigures() {
        return shapes.listIterator();
    }
}
