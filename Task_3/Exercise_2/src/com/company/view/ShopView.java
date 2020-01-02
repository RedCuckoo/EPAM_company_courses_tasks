package com.company.view;

import com.company.model.Shop;

import java.util.ArrayList;

public class ShopView {
    public void print(String toPrint){
        System.out.println(toPrint);
    }

    public void printArrayList(ArrayList<Shop.Department> a){
        for(Shop.Department i : a){
            System.out.println(i.toString());
        }
    }
}
