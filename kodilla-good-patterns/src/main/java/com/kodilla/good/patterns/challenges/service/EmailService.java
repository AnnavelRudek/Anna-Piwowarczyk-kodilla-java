package com.kodilla.good.patterns.challenges.service;

public class EmailService implements InformationService{
    public void inform(User user){
        System.out.println("Sending confirmation e-mail to: " + user.getSurname() + " " + user.getName() + "\n");
    }

}
