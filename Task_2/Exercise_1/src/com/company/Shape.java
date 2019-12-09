package com.company;

public abstract class Shape implements Drawable{
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
}
