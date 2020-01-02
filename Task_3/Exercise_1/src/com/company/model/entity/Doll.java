package com.company.model.entity;

public class Doll extends Toy {
    boolean gender;
    String hairColor;
    String eyesColor;

    public Doll(String name, String material, double price, boolean gender, String hairColor, String eyesColor) {
        super(name, material, price);
        this.gender = gender;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public boolean isGender() {
        return gender;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", gender: " + ((gender) ? "boy" : "girl") + ", hair color: " + hairColor + ", eye color: " + eyesColor ;
    }
}
