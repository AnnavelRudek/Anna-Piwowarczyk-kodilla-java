package com.kodilla.good.patterns.challenges.service;

public class ProductOrderBasket implements OrderRepository{
    public boolean createOrder(User user, Product product){
        System.out.println("Ready for package.");
        return true;
    }

}
