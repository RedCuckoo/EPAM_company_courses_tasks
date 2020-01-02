package com.company.controller;

import com.company.model.ToyRoom;
import com.company.model.ToyRoomCreator;
import com.company.model.entity.Toy;
import com.company.view.ToyView;

import java.util.ArrayList;

public class ToyController {
    ToyRoom<Toy> model;
    ToyView view = new ToyView();

    public ToyController() {
        this.model = ToyRoomCreator.getFilledToyRoom();
    }

    public void run(){
        view.print(model.toString());
        view.print("Sorted by price:");
        view.printArrayListToy(model.sortByPrice());
        view.print("\nSorted by material:");
        view.printArrayListToy(model.sortByMaterial());
        view.print("\nList with prices fromm 0 to 20:");
        view.printArrayListToy(model.getByPrice(0,20));
        view.print("\nGet metal and plastic toys:");
        ArrayList<String> materials = new ArrayList<String>();
        materials.add("metal");
        materials.add("plastic");
        view.printArrayListToy(model.getByMaterial(materials));
    }
}
