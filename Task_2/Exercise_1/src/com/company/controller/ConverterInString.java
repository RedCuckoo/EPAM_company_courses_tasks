package com.company.controller;

import com.company.model.entity.Shape;

public class ConverterInString {
    public static String convertArrayShapes(Shape[] shapes){
        String result = "";
        for(Shape elem : shapes){
            result += elem.draw();
        }
        return result;
    }

    public static String convertDouble(double value, String message){
        return String.format("%s = %.2f\n", message, value);
    }

}
