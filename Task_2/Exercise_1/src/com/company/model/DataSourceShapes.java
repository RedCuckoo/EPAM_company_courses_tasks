package com.company.model;

import com.company.model.entity.Circle;
import com.company.model.entity.Rectangle;
import com.company.model.entity.Shape;
import com.company.model.entity.Triangle;

public class DataSourceShapes {
    public static Shape[] getArrayShape(){
        return new Shape[]{
                new Rectangle("GREEN", 3, 6),
                new Circle("ORANGE", 10),
                new Circle("RED", 2),
                new Rectangle("BLUE", 10, 33),
                new Triangle("MAGENTA", 9, 6, 4),
                new Rectangle("BROWN", 2, 7.9),
                new Circle("YELLOW", 6.7),
                new Triangle("BLACK", 5.6, 11.5, 7.3),
                new Triangle("VIOLET", 4.1, 5.67, 8.9),
                new Rectangle("WHITE", 33, 345.6),
                new Circle("PINK", 8.9)
        };

    }

}
