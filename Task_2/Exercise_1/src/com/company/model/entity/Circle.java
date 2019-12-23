package com.company.model.entity;
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

}
