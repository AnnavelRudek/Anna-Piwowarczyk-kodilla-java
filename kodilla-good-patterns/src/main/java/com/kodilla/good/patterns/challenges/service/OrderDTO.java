package com.kodilla.good.patterns.challenges.service;

public class OrderDTO {

    public User user;
    public boolean isOrdered;

    public OrderDTO(final User user, final boolean isOrdered){
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser(){
        return user;
    }

    public boolean isOrdered(){
        return isOrdered;
    }


}
