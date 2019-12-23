package com.company.model;

import com.company.model.entity.Shape;

import java.util.Comparator;

public class ComparatorColorIncrease implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String sh1 = ((Shape) o1).getShapeColor();
        String sh2 = ((Shape) o2).getShapeColor();
        return sh1.compareTo(sh2));
    }
}
