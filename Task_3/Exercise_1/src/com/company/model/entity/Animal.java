package com.company.model.entity;

public class Animal extends Toy {
    String type;

    public Animal(String name, String material, double price, String type) {
        super(name, material, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type: " + type;
    }
}
