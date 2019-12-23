package com.company.model.entity;

import com.company.model.Drawable;

public abstract class Shape implements Drawable {
    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": shapeColor: " + shapeColor;
    }

    public abstract double calcArea();

    public String draw() {
        return String.format("%s; area=%.2f\n", this, calcArea());
    }
}
