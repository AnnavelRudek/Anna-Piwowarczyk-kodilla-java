package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to GlutenFreeShop. All of our products have glutenfree certificate.");
        return true;
    }

}
