package com.sample.assessment.exercise9.coffeecomposite;

import java.util.List;

public class CoffeeShopsFranchise {
    public String franchiseName;
    public List<CoffeeShop> coffeeShops;

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public List<CoffeeShop> getCoffeeShops() {
        return coffeeShops;
    }

    public void setCoffeeShops(List<CoffeeShop> coffeeShops) {
        this.coffeeShops = coffeeShops;
    }

    public void addCoffeeShop(CoffeeShop coffeeShop) {
        coffeeShops.add(coffeeShop);
    }

}
