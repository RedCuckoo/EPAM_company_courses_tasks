package com.company.model;

import com.company.model.entity.Shape;

import java.util.Comparator;

public class ComparatorIncrease implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Shape sh1 = (Shape) o1;
        Shape sh2 = (Shape) o2;
        return (int)(sh1.calcArea() - sh2.calcArea());
    }
}
