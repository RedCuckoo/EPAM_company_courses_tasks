package com.company.model;

public class FillShop {
    public static Shop getFilledShop(){
        Shop ans = new Shop("Test");
        ans.addDepartment("Milk","diary",2);
        ans.addDepartment("Meat", "butchery", 4);
        ans.addDepartment("Soda", "drinks", 2);
        ans.addDepartment("Cakes", "deserts", 3);
        ans.addDepartment("Sausages", "butchery",4);
        ans.addDepartment("Cheese", "diary", 3);
        return ans;
    }
}
