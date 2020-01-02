package com.company.model;

import com.company.model.entity.Animal;
import com.company.model.entity.Car;
import com.company.model.entity.Doll;
import com.company.model.entity.Toy;

public class ToyRoomCreator {
    public static ToyRoom<Toy> getFilledToyRoom(){
        ToyRoom<Toy> ans = new ToyRoom<Toy>();
        ans.addToy(new Doll("Dolly","plastic",33.4,  false, "brunette", "blue"));
        ans.addToy(new Car("McWeen","metal",14.5,"blue","volvo","truck"));
        ans.addToy(new Doll("Barbie","plastic",13.4,false,"blond","black"));
        ans.addToy(new Animal("Steve","rubber",33.5,"cat"));
        ans.addToy(new Toy("bottle","glass",32.1));
        ans.addToy(new Car("buddy","plastic",22.4,"red","bmw","car"));
        return ans;
    }
}
