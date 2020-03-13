package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Square implements Shape{
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return "Square";
    }
    public double getField() {
        return sqrt(sideLength);
    }
}

