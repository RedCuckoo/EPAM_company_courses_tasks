package com.company.controller;

import com.company.model.FillShop;
import com.company.model.Shop;
import com.company.view.ShopView;

public class ShopController {
    Shop model;
    ShopView view;

    public ShopController(){
        model = new FillShop().getFilledShop();
        view = new ShopView();
    }

    public void run(){
        view.print(model.toString());
        view.print("\nSorted by sector:");
        view.printArrayList(model.departmentsSortedBySector());
        view.print("\nSorted by name:");
        view.printArrayList(model.departmentsSortedByName());
        view.print("\nSorted by type:");
        view.printArrayList(model.departmentsSortedByType());
    }
}
