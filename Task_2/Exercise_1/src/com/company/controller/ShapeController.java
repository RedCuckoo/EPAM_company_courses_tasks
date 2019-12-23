package com.company.controller;

import com.company.model.ComparatorColorIncrease;
import com.company.model.ComparatorIncrease;
import com.company.model.ShapeModel;
import com.company.model.entity.Shape;
import com.company.view.InputData;
import com.company.view.ShapeView;

import java.util.Comparator;

public class ShapeController {
    private ShapeModel model = new ShapeModel();
    private ShapeView view = new ShapeView();

    public void run(){
        view.viewData(ConverterInString.convertArrayShapes(model.getShapes()));
        view.viewData("-------------------------\n");
        view.viewData(ConverterInString.convertDouble(model.getTotalAreaShapes(),
                "Total area"));
        view.viewData("Enter type -> ");
        String type = InputData.input().toLowerCase();
        view.viewData(ConverterInString.convertDouble(
                model.getAreaShapesByType(type),type + " area"));
        view.viewData("-------------------------\n");
        view.viewData("Enter criteria sorting (area,color) -> ");
        String criteria = InputData.input().toLowerCase();
        Comparator comparator = null;
        switch (criteria){
            case "area":
                comparator = new Comparator<Shape>() {
                    @Override
                    public int compare(Object o, Object t1) {
                        return 0;
                    }
                }; break;
            case "color":
                comparator = new ComparatorColorIncrease(); break;
            default: view.viewData("Invalid criteria!");
        }
        if(comparator != null)
            view.viewData(ConverterInString.convertArrayShapes(
                model.sortShapes(comparator)));
    }
}
