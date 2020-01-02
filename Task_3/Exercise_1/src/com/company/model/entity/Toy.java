package com.company.model.entity;

public class Toy {
    private String name;
    private String material;
    private double price;

    public Toy(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Name: \"" + name + "\", material: " + material + ", price: " + price;
    }
}
