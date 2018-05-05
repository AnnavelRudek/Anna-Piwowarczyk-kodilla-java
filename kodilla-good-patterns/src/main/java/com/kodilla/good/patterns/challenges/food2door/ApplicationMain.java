package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;

public class ApplicationMain {
    public static void main(String[] args){
        Product product1 = new Product("mango", 1);
        Product product2 = new Product("milky butter", 1);
        Product product3 = new Product("gluten free pasta", 1);

        Item item1 = new Item(product1, new BigDecimal(1.35));
        Item item2 = new Item(product2, new BigDecimal(0.50));
        Item item3 = new Item(product3, new BigDecimal(1));

        OrderProcessor processor = new OrderProcessor();

        processor.processOrder(new HealthyShop(), item1);
        processor.processOrder(new ExtraFoodShop(), item2);
        processor.processOrder(new GlutenFreeShop(), item3);
    }

}
