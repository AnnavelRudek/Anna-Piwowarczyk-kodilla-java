package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to HealthyFoodShop. All of our products are form bio ingredients!");
        return true;
    }

}
