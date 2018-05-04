package com.kodilla.good.patterns.challenges.service;

public interface OrderRepository {
    boolean createOrder(User user, Product product);

}
