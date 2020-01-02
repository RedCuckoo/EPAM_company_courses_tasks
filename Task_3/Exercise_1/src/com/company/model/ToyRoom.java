package com.company.model;

import com.company.model.entity.Toy;

import java.util.ArrayList;

public class ToyRoom <T extends Toy>{
    private ArrayList<T> toys;

    public ToyRoom() {
        this.toys = new ArrayList<T>();
    }

    public void addToy(T toy){
        toys.add(toy);
    }

    public double getSummedPrice(){
        double ans = 0;
        for(T i : toys){
            ans += i.getPrice();
        }

        return ans;
    }

    public ArrayList<T> getByPrice(double from, double to){
        ArrayList<T> ans = new ArrayList<T>();
        double curPrice;

        for(T i : toys){
            curPrice = i.getPrice();
            if(curPrice >= from && curPrice <= to){
                ans.add(i);
            }
        }

        return ans;
    }

    public ArrayList<T> getByMaterial(ArrayList<String> materials){
        ArrayList<T> ans = new ArrayList<T>();

        for(T i : toys){
            for(String j : materials){
                if(i.getMaterial().equals(j)){
                    ans.add(i);
                    break;
                }
            }
        }

        return ans;
    }

    public ArrayList<T> sortByPrice(){
        toys.sort(new ComparatorPriceIncrease<>());
        return toys;
    }

    public ArrayList<T> sortByMaterial(){
        toys.sort(new ComparatorMaterial<>());
        return toys;
    }

    public ArrayList<T> getToys() {
        return toys;
    }

    @Override
    public String toString() {
        String ans = "";

        for(Toy i : toys){
            ans += i.toString();
            ans += '\n';
        }

        return ans;
    }
}
