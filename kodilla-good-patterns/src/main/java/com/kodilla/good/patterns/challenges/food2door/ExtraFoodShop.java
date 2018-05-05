package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to ExtraFoodShop. You are getting only luxury products!");
        return true;
    }

}
