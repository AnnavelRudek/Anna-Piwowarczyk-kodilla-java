package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setSharingStrategy(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
