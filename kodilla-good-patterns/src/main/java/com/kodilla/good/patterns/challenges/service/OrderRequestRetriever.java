package com.kodilla.good.patterns.challenges.service;

public class OrderRequestRetriever {
    public OrderRequest order(){

        User user = new User("Stefan", "Poziomka");
        Product product = new Product("Headphones");

        return new OrderRequest(user, product);
    }

}
