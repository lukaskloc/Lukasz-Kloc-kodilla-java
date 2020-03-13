package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Circle implements Shape{
    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    public String getShapeName() {
        return "Circle";
    }
    public double getField() {
        return pi * sqrt(radius);
    }
}
