package com.company.model;

import com.company.model.entity.Toy;

import java.util.Comparator;

public class ComparatorPriceIncrease<T extends Toy> implements Comparator<T> {
    @Override
    public int compare(T toy1, T toy2) {
        return (int)(toy1.getPrice() - toy2.getPrice());
    }

}
