package com.kodilla.patterns.strategy.social;

public class TwitterPubisher implements SocialPublisher {
    @Override
    public String share(){
        return "Twitter";
    }
}
