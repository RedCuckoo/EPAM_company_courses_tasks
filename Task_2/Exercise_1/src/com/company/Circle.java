package com.company;
import java.lang.Math;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor,double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius;
    }

    @Override
    public double calcArea() { return (Math.PI * radius * radius); }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }
}
