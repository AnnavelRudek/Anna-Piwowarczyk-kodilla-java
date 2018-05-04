package com.kodilla.good.patterns.challenges.service;

public class ProductOrderService implements OrderService {
    public boolean order(final User, final Product){
        System.out.println(user.getSurname() + " " + user.getName() + " " + "has ordered: " + product.getProductName());
        return true;
    }

}
