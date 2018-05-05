package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    public void processOrder(Shop shop, Item item) {
        boolean ordered = shop.process(item);
        if(ordered) {
            System.out.println("Your order is beeing created...");
        } else {
            System.out.println("Your order was rejected... Please contact our support service phone number: +44 956 656 984");
        }
    }

}
