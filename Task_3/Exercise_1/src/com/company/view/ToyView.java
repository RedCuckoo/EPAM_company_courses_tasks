package com.company.view;

import com.company.model.entity.Toy;

import java.util.ArrayList;

public class ToyView {
    public void print(String toPrint){
        System.out.println(toPrint);
    }

    public void printArrayListToy(ArrayList<Toy> toPrint){
        for(Toy i : toPrint){
            System.out.println(i.toString());
        }
    }
}
