package com.company.model.entity;

public class Car extends Toy{
    private String color;
    private String trademark;
    private String type;

    public Car(String name, String material, double price, String color, String trademark, String type) {
        super(name, material, price);
        this.color = color;
        this.trademark = trademark;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getTrademark() {
        return trademark;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color + ", trademark: " + trademark + ", type: " + type;
    }
}
