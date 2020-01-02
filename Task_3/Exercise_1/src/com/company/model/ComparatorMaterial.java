package com.company.model;

import com.company.model.entity.Toy;

import java.util.Comparator;

public class ComparatorMaterial<T extends Toy> implements Comparator<T> {
    @Override
    public int compare(T toy1, T toy2) {
        return (toy1.getMaterial().compareTo(toy2.getMaterial()));
    }
}
